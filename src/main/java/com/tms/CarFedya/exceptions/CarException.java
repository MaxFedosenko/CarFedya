package com.tms.CarFedya.exceptions;

public abstract class CarException extends RuntimeException{
    
    public CarException(String message) {
        super(message);
    }
    
    public abstract String getViewName();
}
