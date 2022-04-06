package com.example.CarFedya.services;

import com.example.CarFedya.entities.Car;

import java.util.List;

public interface CarService {
    
    List<Car> findAll();
    String calculate(Long id, Double timeRent);
//    Car findByModel(String model);
    Car save(String modelCar, Double rate, String description);
    Car delete(Long id);
    String updateDescription(String description, Long id);
    
}
