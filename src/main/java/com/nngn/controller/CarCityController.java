package com.nngn.controller;



import com.nngn.entity.CarCity;
import com.nngn.service.CarCityService;
import com.nngn.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarCityController {

    @Autowired(required = false)
    private CarCityService carCityService;

    @RequestMapping(value="getCities")
    public ActionResult findCityByPid(int pid){

        List<CarCity> cities = carCityService.findCitiesByPid(pid);
        System.out.println(cities);
        ActionResult result = new ActionResult(200, null, cities);
        return result;
    }
    @RequestMapping(value="getCity")
    public ActionResult findCityById(Integer getid,Integer backid){
        ArrayList<CarCity> carCities = new ArrayList<>();
        CarCity getCity = carCityService.findCityById(getid);
        CarCity backCity = carCityService.findCityById(backid);
        carCities.add(getCity);
        carCities.add(backCity);
        ActionResult result = new ActionResult(200, null, carCities);
        System.out.println(result);
        return result;
    }

}
