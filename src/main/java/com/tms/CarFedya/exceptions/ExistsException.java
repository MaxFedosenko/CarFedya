package com.tms.CarFedya.exceptions;

public class ExistsException extends RuntimeException{
    
    public ExistsException(String message) {
        super(message);
    }
    
    @Override
    public String toString() {
        return "ExistsException{" +
                ", message=" + getMessage() +
                '}';
    }
}
