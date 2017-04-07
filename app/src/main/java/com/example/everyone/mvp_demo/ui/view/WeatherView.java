package com.example.everyone.mvp_demo.ui.view;

import com.example.everyone.mvp_demo.model.entity.Weather;

/**
 * Created by everyone on 2017/4/7.
 */

public interface WeatherView {
    void showLoading();
    void hideLoading();
    void showError();
    void setWeatherInfo(Weather weather);
}
