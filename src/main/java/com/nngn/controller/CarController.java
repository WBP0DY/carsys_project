package com.nngn.controller;

import com.nngn.entity.Car;
import com.nngn.service.CarService;
import com.nngn.utils.ActionResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

   @Autowired(required = false)
    private CarService carService;

   @RequestMapping(value = "/getCars",method = RequestMethod.GET)
   public ActionResult findCarsByPrice(){
       List<Car> carsByPrice = carService.findCarsByPrice();
       System.out.println(carsByPrice);
       ActionResult result = new ActionResult(200, null, carsByPrice);
       return  result;
   }

    @RequestMapping(value = "/getCarsByNum",method = RequestMethod.GET)
    public ActionResult findCarsByNum(){
        List<Car> carsByNum = carService.findCarsByNum();
        ActionResult result = new ActionResult(200, null, carsByNum);
        return  result;
    }

    @RequestMapping(value = "/findCar",method = RequestMethod.GET)
    public ActionResult findCar(Integer id){

       Car car = carService.findCar(id);
        System.out.println(car);
        ActionResult result = new ActionResult(200, null, car);
        return result;

    }



}
