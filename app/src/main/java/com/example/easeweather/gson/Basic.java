package com.example.easeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZS_PC on 2017/10/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
