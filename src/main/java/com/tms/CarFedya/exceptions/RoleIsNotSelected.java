package com.tms.CarFedya.exceptions;

public class RoleIsNotSelected extends CarException {
    
    public RoleIsNotSelected(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforeclientregistration";
    }
    
}
