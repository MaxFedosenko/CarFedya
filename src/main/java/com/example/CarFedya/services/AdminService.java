package com.example.CarFedya.services;

import com.example.CarFedya.entities.Admin;

public interface AdminService {
    
    Admin findByLogin(String login);
    
}
