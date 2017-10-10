package com.example.easeweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ZS_PC on 2017/10/10.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
