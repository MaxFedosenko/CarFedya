package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Admin;
import com.tms.CarFedya.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    
    @Autowired
    AdminRepository adminRepository;
    
    @Override
    public String registration(String login, String password) {
        Admin admin = adminRepository.findByLogin(login);
        if (admin == null && login.contains("admin")) {
            adminRepository.save(new Admin(login, password));
            return "startpages/adminfinalregistration";
        } else {
            throw new IllegalArgumentException("проверьте правильность ввода данных!");
        }
    }
}
