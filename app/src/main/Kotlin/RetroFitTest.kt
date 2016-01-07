package com.example.horinoa.mykotlin

import com.example.horinoa.mykotlin.WeatherApi
import com.example.horinoa.mykotlin.WeatherEntity
import retrofit.*

/**
 * Created by horinoA on 2016/01/07.
 */
class RetroFitTest {
    fun retroFitCall(city: Int?,callback:(WeatherEntity) -> Unit) {

        val retrofit = Retrofit.Builder()
                .baseUrl("http://weather.livedoor.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(WeatherApi::class.java)

        val call = service.getWeather(city)
        call.enqueue(object : Callback<WeatherEntity> {
            override fun onResponse(response: Response<WeatherEntity>, retrofit: Retrofit) {
                callback(response.body())
            }
            override fun onFailure(t: Throwable) {
                callback(null!!)
            }
        })
    }

}
