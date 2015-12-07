package com.fanhl.retrofitdemo.rest.service;

import com.fanhl.retrofitdemo.rest.model.FolderResponse;
import com.fanhl.retrofitdemo.rest.model.GengerConfirmInfo;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by fanhl on 15/12/1.
 */
public interface HomeService {
    @FormUrlEncoded
    @POST("/ajax/folder.php")
    Call<FolderResponse> bookList(
            @Field("token") String token,
            @Field("offset") int offset,
            @Field("max") int max,
            @Field("sort") String sort,
            @Field("param") String param);

    @POST("/ajax/poll.php")
    Call<GengerConfirmInfo> poll();
}
