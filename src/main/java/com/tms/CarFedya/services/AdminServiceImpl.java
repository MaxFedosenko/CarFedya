package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Admin;
import com.tms.CarFedya.repositories.AdminRepository;
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
