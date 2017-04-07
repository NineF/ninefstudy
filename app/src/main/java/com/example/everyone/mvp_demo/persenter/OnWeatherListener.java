package com.example.everyone.mvp_demo.persenter;

import com.example.everyone.mvp_demo.model.entity.Weather;

/**
 * Created by everyone on 2017/4/7.
 */

public interface OnWeatherListener {


    void onSuccess(Weather weather);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();
}
