package com.example.CarFedya.services;

import com.example.CarFedya.entities.Client;

public interface ClientService {
    
    Client findByLogin(String login);
    String booking(Long carId, String login);
    String clientRegistration(String name, String login, String password, String numberPhone, String email);
    
}
