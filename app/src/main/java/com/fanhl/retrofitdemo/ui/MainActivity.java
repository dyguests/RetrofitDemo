package com.fanhl.retrofitdemo.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.fanhl.retrofitdemo.R;

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

    }

    @OnClick(R.id.async)
    void async() {

    }

    @OnClick(R.id.rx)
    void rx() {

    }

    @OnClick(R.id.download)
    void download() {
        app.getClient().getFileDownloadService().downloadFile("")
                .enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Response<Void> response, Retrofit retrofit) {

                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Log.e(TAG, "Ooops,download failed.");
                    }
                });
    }
}
