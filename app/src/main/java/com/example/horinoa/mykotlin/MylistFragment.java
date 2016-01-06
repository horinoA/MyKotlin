package com.example.horinoa.mykotlin;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by horinoA on 2016/01/06.
 */
public class MylistFragment extends ListFragment {
    MyListAdapter mAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WeatherEntity weatherEntity = new WeatherEntity();
        Forecast forecast = new Forecast();
        forecast.setDateLabel("ここに結果が表示");
        forecast.setTelop("テロップ");
        weatherEntity.getForecasts().add(forecast);

        mAdapter = new MyListAdapter(getActivity().getApplicationContext(),
                weatherEntity.getForecasts());
        setListAdapter(mAdapter);

    }

    public void reflashListFragment(){
        Log.d("test","reflash");
        //mAdapter.clear();
        //mAdapter.addAll(new WeatherEntity().getForecasts());
        //mAdapter.notifyDataSetChanged();
    }


}
