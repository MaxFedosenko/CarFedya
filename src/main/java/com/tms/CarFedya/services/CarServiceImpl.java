package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Car;
import com.tms.CarFedya.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    
    @Autowired
    CarRepository carRepository;
    @Autowired
    Validator validator;
    
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }
    
    @Override
    public String calculate(Long id, Double timeRent) {
        Double rate = carRepository.findById(id).get().getRate();
        String result = validator.calculateValidator(rate, timeRent);
        return result;
    }
    
    @Override
    public Car save(String modelCar, Double rate, String description) {
        return carRepository.save(new Car(modelCar, rate, description));
    }
    
    @Override
    public Car delete(Long id) {
        Car car = carRepository.findById(id).get();
        carRepository.delete(car);
        return car;
    }
    
    
    @Override
    public String updateDescription(String description, Long id) {
        carRepository.updateDescription(description, id);
        return "adminpages/finalupdate";
    }
}
