package com.fanhl.retrofitdemo.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.fanhl.retrofitdemo.R;
import com.fanhl.retrofitdemo.rest.model.GengerConfirmInfo;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AbsActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.textView)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.sync)
    void sync() {
        // FIXME: 15/12/7
        //do not run long time process in UI thread.
        new AsyncTask<Void, Void, GengerConfirmInfo>() {
            @Override
            protected GengerConfirmInfo doInBackground(Void... params) {
                try {
                    //sync
                    return app.getClient().getGenderService().poll().execute().body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(GengerConfirmInfo gengerConfirmInfo) {
                if (gengerConfirmInfo != null) {
                    mTextView.setText(gengerConfirmInfo.toString());
                }
            }
        }.execute();
    }

    @OnClick(R.id.async)
    void async() {
        app.getClient().getGenderService().poll().enqueue(new Callback<GengerConfirmInfo>() {

            @Override
            public void onResponse(Response<GengerConfirmInfo> response, Retrofit retrofit) {
                GengerConfirmInfo info = response.body();
                if (info != null) {
                    mTextView.setText(info.toString());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(TAG, Log.getStackTraceString(t));
            }
        });
    }

    @OnClick(R.id.rx)
    void rx() {

    }

    @OnClick(R.id.download)
    void download() {
        String url = "https://raw.githubusercontent.com/dyguests/RetrofitDemo/master/graphics/head.jpg";
        app.getClient().getFileDownloadService().downloadFile(url)
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Response<Response> response, Retrofit retrofit) {
                        //OK , I give up.
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });

    }
}
