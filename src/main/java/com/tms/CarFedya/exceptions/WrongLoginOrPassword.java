package com.tms.CarFedya.exceptions;

public class WrongLoginOrPassword extends CarException {
    
    public WrongLoginOrPassword(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "authorization";
    }
    
}
