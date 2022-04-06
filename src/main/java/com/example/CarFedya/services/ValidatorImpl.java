package com.example.CarFedya.services;

import com.example.CarFedya.entities.Admin;
import com.example.CarFedya.entities.Client;
import org.springframework.stereotype.Service;

@Service
public class ValidatorImpl implements Validator {
    
    public String calculateValidator(Double rate, Double timeRent){
        if (timeRent < 1) {
            throw new IllegalArgumentException("Проверьте правильность ввода времени аренды автомобиля!");
        } else {
            return String.format("%.1f", 60 * rate * timeRent);
        }
    }
    
    public Client clientValidator(Client client, String password) {
        if (client != null && client.getPassword().equals(password)) {
            return client;
        } else {
            throw new NullPointerException("Неверный логин или пароль");
        }
    }
    
    public Admin adminValidator(Admin admin, String password) {
        if (admin != null && admin.getPassword().equals(password) && admin.getLogin().contains("admin")) {
            return admin;
        } else {
            throw new NullPointerException("Неверный логин или пароль");
        }
    }
    
    public void bookingValidator(Long carId) {
        if (carId == 500) {
            throw new NumberFormatException("В данный момент все машины заняты!");
        }
    }
    
    public String  authorizationValidator(Admin admin, Client client, String password) {
        if (admin != null) {
            adminValidator(admin, password);
            return "redirect:/admin";
        } else {
            clientValidator(client, password);
            return "redirect:/client";
        }
    }
}
