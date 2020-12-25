package com.nngn.service.impl;

import com.nngn.dao.CarCityMapper;
import com.nngn.entity.CarCity;
import com.nngn.service.CarCityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarCityServiceImpl implements CarCityService {

    @Autowired
    private CarCityMapper carCityMapper;

    @Override
    public List<CarCity> findCitiesByPid(int pid) {
        return carCityMapper.findCitiesByPid(pid);
    }

    @Override
    public CarCity findCityById(int id) {
        return carCityMapper.findCityById(id);
    }
}
