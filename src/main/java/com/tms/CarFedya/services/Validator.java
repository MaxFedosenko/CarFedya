package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Admin;
import com.tms.CarFedya.entities.Client;

public interface Validator {
    String calculateValidator(Double rate, Double timeRent);
    Client clientValidator(Client client, String password);
    Admin adminValidator(Admin admin, String password);
    void bookingValidator(Long carId);
    String  authorizationValidator(Admin admin, Client client, String password);
}
