package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Car;
import com.tms.CarFedya.entities.Client;

public interface Validator {
    boolean validate(Double timeRent);
    Client validate(Client client, String password);
    Client validate(Client client);
    boolean validate(Long carId);
    boolean validate(Car car);
    boolean validate(String description);
}
