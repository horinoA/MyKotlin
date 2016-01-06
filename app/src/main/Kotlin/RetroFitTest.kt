package com.example.horinoa.mykotlin

import android.util.Log
import com.example.horinoa.mykotlin.Forecast
import com.example.horinoa.mykotlin.WeatherApi
import com.example.horinoa.mykotlin.WeatherEntity
import retrofit.Callback
import retrofit.Response
import retrofit.Retrofit

/**
 * Created by horinoA on 2016/01/05.
 */
class RetroFitTest {

    fun retroFitCall(city:Int,callback:(WeatherEntity?) -> Unit) {
        val retrofit = Retrofit.Builder().baseUrl("http://weather.livedoor.com").build()
        val service = retrofit.create(WeatherApi::class.java)

        service.getWeather(city, object : Callback<WeatherEntity> {
            override fun onResponse(response: Response<WeatherEntity>, retrofit: Retrofit) {
                if (response.isSuccess){
                    callback(response.body())
                }else {
                    callback(null)
                }
            }
            override fun onFailure(t: Throwable) {
                Log.d("getWeatherError", t.toString())
                callback(null)
            }
        })
    }

}
