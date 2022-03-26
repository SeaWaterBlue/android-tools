package com.ubx.tools;

import androidx.lifecycle.LiveData;

import com.ubx.ocean.http.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @description:
 * @author: haiqing zhao
 * @date: 2022/3/26 11:22
 */
public interface HttpService {
    @GET("/api/v1/strategy/upload/")
    Call<ApiResponse> getbaidu();
    @GET("/api/v1/strategy/upload/")
    LiveData<ApiResponse> getbaiduLive();
}
