package com.fanhl.retrofitdemo.rest.service;


import retrofit.Call;
import retrofit.Response;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Streaming;

/**
 * Created by fanhl on 15/12/7.
 */
public interface FileDownloadService {
    @Streaming
    @GET("{url}")
    Call<Response> downloadFile(@Path("url") String url);
}
