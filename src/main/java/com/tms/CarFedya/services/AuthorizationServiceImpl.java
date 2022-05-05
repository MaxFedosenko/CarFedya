package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Client;
import com.tms.CarFedya.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    Validator validator;
    
    @Override
    public String authorization(String login, String password) {
        Client client = validator.validate(clientRepository.findByLogin(login), password);
        if (client.getRole().equals("admin")){
            return "redirect:/admin";
        } else {
            return "redirect:/client";
        }
    }
}
