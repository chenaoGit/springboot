package com.cywx.city.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cywx.city.dao.CityDao;
import com.cywx.city.dto.CityDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhulei on 18-2-3.
 */
@Service(version = "1.0-zl")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public CityDto findCityByName(String cityName) {
       return cityDao.findByName(cityName);
    }

    @Override
    public String helloWorld(String name) {
        return "hello world "+name;
    }
}
