package com.fanhl.retrofitdemo.rest;

import com.fanhl.retrofitdemo.rest.service.GenderService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by fanhl on 15/12/1.
 */
public class DoujinClient {

    public static final String BASE_URL = "http://www.doujinmoe.us";
    private final GenderService genderService;

    public DoujinClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        genderService = retrofit.create(GenderService.class);
    }

    public GenderService getGenderService() {
        return genderService;
    }
}
