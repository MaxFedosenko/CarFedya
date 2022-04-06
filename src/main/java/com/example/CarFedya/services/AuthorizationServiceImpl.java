package com.example.CarFedya.services;

import com.example.CarFedya.entities.Admin;
import com.example.CarFedya.entities.Client;
import com.example.CarFedya.repositories.AdminRepository;
import com.example.CarFedya.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    Validator validator;
    
    @Override
    public String authorization(String login, String password) {
        Admin admin = adminRepository.findByLogin(login);
        Client client = clientRepository.findByLogin(login);
        return validator.authorizationValidator(admin, client, password);
    }
}
