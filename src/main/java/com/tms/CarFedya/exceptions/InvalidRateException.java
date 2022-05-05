package com.tms.CarFedya.exceptions;

public class InvalidRateException extends CarException {
    
    public InvalidRateException(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforecreate";
    }
    
}
