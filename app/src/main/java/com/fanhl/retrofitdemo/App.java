package com.fanhl.retrofitdemo;

import android.app.Application;

import com.fanhl.retrofitdemo.rest.MyClient;

/**
 * Created by fanhl on 15/12/1.
 */
public class App extends Application {

    private MyClient client;

    @Override
    public void onCreate() {
        super.onCreate();
        client = new MyClient();
    }

    public MyClient getClient() {
        return client;
    }
}
