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
        validator.validate(timeRent);
        Double rate = carRepository.findById(id).get().getRate();
        return String.format("%.1f", 60 * rate * timeRent);
    }
    
    @Override
    public Car save(Car car) {
        validator.validate(car);
        return carRepository.save(car);
    }
    
    @Override
    public Car delete(Long id) {
        Car car = carRepository.findById(id).get();
        carRepository.delete(car);
        return car;
    }
    
    
    @Override
    public void updateDescription(String description, Long id) {
        validator.validate(description);
        carRepository.updateDescription(description, id);
    }
}
