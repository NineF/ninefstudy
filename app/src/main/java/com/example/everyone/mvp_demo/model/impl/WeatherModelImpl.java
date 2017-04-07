package com.example.everyone.mvp_demo.model.impl;

import com.example.everyone.mvp_demo.model.WeatherModel;
import com.example.everyone.mvp_demo.model.entity.Weather;
import com.example.everyone.mvp_demo.persenter.OnWeatherListener;

/**
 * Created by everyone on 2017/4/7.
 */

public class WeatherModelImpl implements WeatherModel {
    @Override
    public void loadWeather(String cityname, OnWeatherListener listener) {
        if(cityname=="chengdu"){
            Weather weather=new Weather("chengdu","111111");

            listener.onSuccess(weather);
        }else{
            listener.onError();
        }

    }
}
