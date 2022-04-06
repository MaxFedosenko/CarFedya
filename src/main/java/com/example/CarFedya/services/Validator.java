package com.example.CarFedya.services;

import com.example.CarFedya.entities.Admin;
import com.example.CarFedya.entities.Client;

public interface Validator {
    String calculateValidator(Double rate, Double timeRent);
    Client clientValidator(Client client, String password);
    Admin adminValidator(Admin admin, String password);
    void bookingValidator(Long carId);
    String  authorizationValidator(Admin admin, Client client, String password);
}
