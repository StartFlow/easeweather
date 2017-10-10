package com.example.easeweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ZS_PC on 2017/10/10.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private  int cityCode;
    private  int provinceId;

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
