package com.nngn.service;

import com.nngn.entity.CarCity;


import java.util.List;

public interface CarCityService {

    public List<CarCity> findCitiesByPid(int pid);
    public CarCity findCityById(int id);
}
