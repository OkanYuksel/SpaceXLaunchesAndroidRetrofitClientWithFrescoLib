package com.okanyuksel.spacexlaunchesandroidretrofitclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestInterface {
    @GET("v2/launches")
    Call<List<Launch>> getRepo();
}
