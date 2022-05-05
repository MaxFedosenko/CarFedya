package com.tms.CarFedya.exceptions;

public class ClientFieldsException extends CarException {
    
    public ClientFieldsException(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforeclientregistration";
    }
    
}
