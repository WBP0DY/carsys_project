package com.nngn.service;

import com.nngn.entity.Car;


import java.util.List;

public interface CarService {

    public List<Car> findCarsByPrice();

    public List<Car> findCarsByNum();

    public Car findCar(Integer id);
}
