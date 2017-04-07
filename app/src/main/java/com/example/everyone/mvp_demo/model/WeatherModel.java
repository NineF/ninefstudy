package com.example.everyone.mvp_demo.model;

import com.example.everyone.mvp_demo.persenter.OnWeatherListener;

/**
 * Created by everyone on 2017/4/7.
 */

public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}


