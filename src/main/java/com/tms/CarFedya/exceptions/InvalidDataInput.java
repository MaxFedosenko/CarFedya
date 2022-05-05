package com.tms.CarFedya.exceptions;

public class InvalidDataInput extends CarException {
    
    public InvalidDataInput(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforecalculate";
    }
    
}
