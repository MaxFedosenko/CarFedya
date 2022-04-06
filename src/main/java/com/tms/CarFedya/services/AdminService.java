package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Admin;

public interface AdminService {
    
    Admin findByLogin(String login);
    
}
