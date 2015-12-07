package com.fanhl.retrofitdemo;

import android.app.Application;

import com.fanhl.retrofitdemo.rest.MyClient;
import com.fanhl.retrofitdemo.rest.RxClient;

/**
 * Created by fanhl on 15/12/1.
 */
public class App extends Application {

    private MyClient client;
    private RxClient rxClient;

    @Override
    public void onCreate() {
        super.onCreate();
        client = new MyClient();
        rxClient = new RxClient();
    }

    public MyClient getClient() {
        return client;
    }

    public RxClient getRxClient() {
        return rxClient;
    }
}
