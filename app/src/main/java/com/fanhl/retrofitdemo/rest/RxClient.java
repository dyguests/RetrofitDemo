package com.fanhl.retrofitdemo.rest;

import com.fanhl.retrofitdemo.rest.service.FileDownloadService;
import com.fanhl.retrofitdemo.rest.service.RxService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by fanhl on 15/12/7.
 */
public class RxClient {
    public static final String BASE_URL = "http://www.doujinmoe.us";
    private final RxService           rxService;
    private final FileDownloadService fileDownloadService;

    public RxClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        rxService = retrofit.create(RxService.class);
        fileDownloadService = retrofit.create(FileDownloadService.class);
    }

    public RxService getRxService() {
        return rxService;
    }

    public FileDownloadService getFileDownloadService() {
        return fileDownloadService;
    }
}
