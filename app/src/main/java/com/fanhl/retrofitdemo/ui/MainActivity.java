package com.fanhl.retrofitdemo.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.fanhl.retrofitdemo.App;
import com.fanhl.retrofitdemo.R;
import com.fanhl.retrofitdemo.rest.model.GengerConfirmInfo;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView             textView;
    private FloatingActionButton fab;
    private App                  app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        app = ((App) getApplication());

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poll();
            }
        });

        textView = ((TextView) findViewById(R.id.textView));
    }

    private void poll() {
        Log.d(TAG, "poll");
        app.getDoujinClient().getGenderService().poll().enqueue(new Callback<GengerConfirmInfo>() {
            @Override
            public void onResponse(Response<GengerConfirmInfo> response, Retrofit retrofit) {
                Log.d(TAG, "response:" + response);
                textView.setText(response.body().toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(TAG, "onFailure");
                textView.setText(t.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
