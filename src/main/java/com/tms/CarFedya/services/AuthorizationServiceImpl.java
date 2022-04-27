package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Admin;
import com.tms.CarFedya.entities.Client;
import com.tms.CarFedya.repositories.AdminRepository;
import com.tms.CarFedya.repositories.ClientRepository;
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
