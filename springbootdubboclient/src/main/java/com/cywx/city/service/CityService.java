package com.cywx.city.service;


import com.cywx.city.dto.CityDto;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    CityDto findCityByName(String cityName);

    String  helloWorld(String name);
}
