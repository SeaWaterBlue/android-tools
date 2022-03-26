package com.ubx.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ubx.ocean.http.ApiResponse;
import com.ubx.ocean.http.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RetrofitManager.getCall("http://49.232.114.172:8080/").create(HttpService.class)
                .getbaidu().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                System.out.println(response.body().data);
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
//        RetrofitManager.get("https://service.urovo.com:911/").create(HttpService.class).
    }
}