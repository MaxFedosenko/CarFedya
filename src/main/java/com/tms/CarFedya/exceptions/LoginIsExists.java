package com.tms.CarFedya.exceptions;

public class LoginIsExists extends CarException {
    
    public LoginIsExists(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforeclientregistration";
    }
    
}
