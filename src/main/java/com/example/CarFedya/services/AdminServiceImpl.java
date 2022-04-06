package com.example.CarFedya.services;

import com.example.CarFedya.entities.Admin;
import com.example.CarFedya.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    AdminRepository adminRepository;
    
    @Override
    public Admin findByLogin(String login) {
        return adminRepository.findByLogin(login);
    }
}
