package com.fanhl.retrofitdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fanhl.retrofitdemo.App;

/**
 * Created by fanhl on 15/12/7.
 */
public abstract class AbsActivity extends AppCompatActivity {

    protected App app;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = ((App) getApplication());
    }
}
