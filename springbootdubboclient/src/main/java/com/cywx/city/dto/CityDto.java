package com.cywx.city.dto;

import java.io.Serializable;

/**
 * Created by zhulei on 18-2-3.
 */
public class CityDto implements Serializable{

    private static final long serialVersionUID = 5651500861100771346L;

    private  String cityName;

    private String description;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
