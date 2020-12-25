package com.nngn.service.impl;

import com.nngn.dao.CarMapper;
import com.nngn.entity.Car;
import com.nngn.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired(required = false)
    private CarMapper carMapper;

    @Override
    public List<Car> findCarsByPrice() {
        return carMapper.findCarsByPrice();
    }

    @Override
    public List<Car> findCarsByNum() {
        return carMapper.findCarsByNum();
    }

    @Override
    public Car findCar(Integer id) {
        return carMapper.findCar(id);
    }
}
