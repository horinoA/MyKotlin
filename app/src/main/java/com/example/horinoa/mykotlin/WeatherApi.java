package com.example.horinoa.mykotlin;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by horinoA on 2016/01/05.
 */
public interface WeatherApi {
    @GET("/forecast/webservice/json/v1")
    //void getWeather(@Query("city") Integer city, Callback<WeatherEntity> cb);
    Call<WeatherEntity> getWeather(@Query("city") Integer city);
}
