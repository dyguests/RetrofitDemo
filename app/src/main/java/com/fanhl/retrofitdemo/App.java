package com.fanhl.retrofitdemo;

import android.app.Application;

import com.fanhl.retrofitdemo.rest.DoujinClient;

/**
 * Created by fanhl on 15/12/1.
 */
public class App extends Application {

    private DoujinClient doujinClient;

    @Override
    public void onCreate() {
        super.onCreate();
        doujinClient = new DoujinClient();
    }

    public DoujinClient getDoujinClient() {
        return doujinClient;
    }
}
