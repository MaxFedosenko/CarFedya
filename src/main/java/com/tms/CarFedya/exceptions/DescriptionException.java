package com.tms.CarFedya.exceptions;

public class DescriptionException extends CarException {
    
    public DescriptionException(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforeupdate";
    }
    
}
