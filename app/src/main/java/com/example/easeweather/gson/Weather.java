package com.example.easeweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZS_PC on 2017/10/12.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
