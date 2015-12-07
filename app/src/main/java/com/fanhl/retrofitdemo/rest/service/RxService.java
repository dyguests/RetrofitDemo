package com.fanhl.retrofitdemo.rest.service;

import com.fanhl.retrofitdemo.rest.model.FolderResponse;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by fanhl on 15/12/7.
 */
public interface RxService {
    @FormUrlEncoded
    @POST("/ajax/folder.php")
    Observable<FolderResponse> bookList(
            @Field("token") String token,
            @Field("offset") int offset,
            @Field("max") int max,
            @Field("sort") String sort,
            @Field("param") String param);
}
