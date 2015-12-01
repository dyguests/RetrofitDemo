package com.fanhl.retrofitdemo.rest.service;

import com.fanhl.retrofitdemo.rest.model.GengerConfirmInfo;

import retrofit.Call;
import retrofit.http.POST;

/**
 * Created by fanhl on 15/12/1.
 */
public interface GenderService {
    @POST("/ajax/poll.php")
    Call<GengerConfirmInfo> poll();
}
