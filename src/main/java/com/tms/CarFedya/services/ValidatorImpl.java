package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Car;
import com.tms.CarFedya.entities.Client;
import com.tms.CarFedya.exceptions.*;
import org.springframework.stereotype.Service;

@Service
public class ValidatorImpl implements Validator {
    
    public boolean validate(Double timeRent) {
        if (timeRent < 0.5) {
            throw new InvalidDataInput("Проверьте правильность ввода времени аренды автомобиля!");
        } else {
            return true;
        }
    }
    
    public Client validate(Client client, String password) {
        if (client != null && client.getPassword().equals(password)) {
            return client;
        } else {
            throw new WrongLoginOrPassword("Неверный логин или пароль");
        }
    }
    
    public Client validate(Client client) {
        if (client != null && !client.getRole().equals("noRole")) {
            return client;
        } else {
            throw new RoleIsNotSelected("Выберите роль");
        }
    }
    
    public boolean validate(Long carId) {
        if (carId == -1) {
            throw new BookingException("В данный момент все машины заняты!");
        } else {
            return true;
        }
    }
    
    public boolean validate(Car car) {
        if (car.getRate() < 0.05) {
            throw new InvalidRateException("Стоимость не может быть указана ниже чем 0,05 BYN");
        } else {
            return true;
        }
    }
    
    public boolean validate(String description) {
        if (description.equals("")) {
            throw new DescriptionException("Заполните описание машины");
        } else {
            return true;
        }
    }
    
}
