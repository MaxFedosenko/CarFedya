package com.tms.CarFedya.exceptions;

public class BookingException extends CarException {
    
    public BookingException(String message) {
        super(message);
    }
    
    @Override
    public String getViewName() {
        return "beforebooking";
    }
    
}
