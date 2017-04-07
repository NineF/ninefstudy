package com.example.everyone.mvp_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.everyone.mvp_demo.model.entity.Weather;
import com.example.everyone.mvp_demo.persenter.WeatherPersenter;
import com.example.everyone.mvp_demo.persenter.impl.WeatherPersenterImpl;
import com.example.everyone.mvp_demo.ui.view.WeatherView;

public class MainActivity extends AppCompatActivity implements WeatherView{
    private Button button;
    private TextView textView;
    WeatherPersenter weatherPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);

        weatherPersenter=new WeatherPersenterImpl(MainActivity.this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherPersenter.getWeather("chengdu");
            }
        });
    }




    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void setWeatherInfo(Weather weather) {

        Toast.makeText(MainActivity.this,weather.getCityweather(),Toast.LENGTH_SHORT).show();
    }
}
