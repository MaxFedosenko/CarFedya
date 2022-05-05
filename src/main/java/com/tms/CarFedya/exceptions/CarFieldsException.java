package com.tms.CarFedya.exceptions;

public class CarFieldsException extends CarException {
    
    public CarFieldsException(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforecreate";
    }
}
