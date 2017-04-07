package com.example.everyone.mvp_demo.model.entity;

/**
 * Created by everyone on 2017/4/7.
 */

public class Weather {
    private String cityname;
    private String cityweather;

    public Weather(String cityname, String cityweather) {
        this.cityname = cityname;
        this.cityweather = cityweather;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCityweather() {
        return cityweather;
    }

    public void setCityweather(String cityweather) {
        this.cityweather = cityweather;
    }
}
