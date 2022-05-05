package com.tms.CarFedya.exceptions;

public class LoginIsNotExists extends CarException {
    
    public LoginIsNotExists(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforebooking";
    }
    
}
