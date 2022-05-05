package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Client;

public interface ClientService {
    
    void booking(Long carId, String login);
    void clientRegistration(Client client);
    
}
