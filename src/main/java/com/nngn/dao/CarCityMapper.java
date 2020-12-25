package com.nngn.dao;

import com.nngn.entity.CarCity;


import java.util.List;

public interface CarCityMapper {

    public List<CarCity> findCitiesByPid(int pid);

    public CarCity findCityById(int id);

}
