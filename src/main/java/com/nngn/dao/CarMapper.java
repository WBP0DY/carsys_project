package com.nngn.dao;

import com.nngn.entity.Car;


import java.util.List;

public interface CarMapper {

    public List<Car> findCarsByPrice();

    public List<Car> findCarsByNum();

    public Car findCar(Integer id);
}
