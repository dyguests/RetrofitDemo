package com.fanhl.retrofitdemo.rest;

import com.fanhl.retrofitdemo.rest.service.FileDownloadService;
import com.fanhl.retrofitdemo.rest.service.GenderService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by fanhl on 15/12/1.
 */
public class MyClient {

    public static final String BASE_URL = "http://www.doujinmoe.us";
    private final GenderService       genderService;
    private final FileDownloadService fileDownloadService;

    public MyClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        genderService = retrofit.create(GenderService.class);
        fileDownloadService = retrofit.create(FileDownloadService.class);
    }

    public GenderService getGenderService() {
        return genderService;
    }

    public FileDownloadService getFileDownloadService() {
        return fileDownloadService;
    }
}
