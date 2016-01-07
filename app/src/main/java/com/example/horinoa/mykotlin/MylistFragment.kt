package com.example.horinoa.mykotlin

import android.app.ListFragment
import android.os.Bundle
import android.util.Log
import android.widget.TextView

import java.util.ArrayList

/**
 * Created by horinoA on 2016/01/06.
 */
class MylistFragment : ListFragment() {
    var mAdapter: MyListAdapter? = null

    fun init(){}

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val weatherEntity = WeatherEntity()
        val forecast = Forecast()
        forecast.dateLabel = "ここに結果が表示"
        forecast.telop = "テロップ"
        weatherEntity.forecasts.add(forecast)

        mAdapter = MyListAdapter(activity.applicationContext,
                weatherEntity.forecasts)
        listAdapter = mAdapter

    }

    fun reflashListFragment() {
        val retro = RetroFitTest()
        retro.retroFitCall(400040,{
            if (it != null){
                Log.d("retro", "retrofitOk")
                mAdapter?.clear()
                mAdapter?.addAll(it.forecasts)
                mAdapter?.notifyDataSetChanged()
            }else{
                Log.d("retro", "retrofitError")
            }
        })
    }


}
