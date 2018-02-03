package com.cywx.city.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cywx.city.dto.CityDto;
import com.cywx.city.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhulei on 18-2-3.
 */
@RestController
public class CityAction {

    @Reference(version = "1.0-zl")
    private CityService cityService;

    @RequestMapping("/api/findByName")
    public CityDto findByName(@RequestParam(value = "cityName", required = true) String cityName){
        return cityService.findCityByName(cityName);
    }
}
