package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Car;

import java.util.List;

public interface CarService {
    
    List<Car> findAll();
    String calculate(Long id, Double timeRent);
    Car save(Car car);
    Car delete(Long id);
    void updateDescription(String description, Long id);
    
}
