package com.example.everyone.mvp_demo.persenter.impl;

import com.example.everyone.mvp_demo.model.WeatherModel;
import com.example.everyone.mvp_demo.model.entity.Weather;
import com.example.everyone.mvp_demo.model.impl.WeatherModelImpl;
import com.example.everyone.mvp_demo.persenter.OnWeatherListener;
import com.example.everyone.mvp_demo.persenter.WeatherPersenter;
import com.example.everyone.mvp_demo.ui.view.WeatherView;

/**
 * Created by everyone on 2017/4/7.
 */

public class WeatherPersenterImpl implements WeatherPersenter ,OnWeatherListener{
    WeatherModel weatherModel;
    WeatherView mview;

    public WeatherPersenterImpl(WeatherView view){
        this.mview=view;
    }

    @Override
    public void getWeather(String cityname) {
        weatherModel=new WeatherModelImpl();
        weatherModel.loadWeather(cityname,this);
    }

    @Override
    public void onSuccess(Weather weather) {
        mview.setWeatherInfo(weather);
    }

    @Override
    public void onError() {

    }
}
