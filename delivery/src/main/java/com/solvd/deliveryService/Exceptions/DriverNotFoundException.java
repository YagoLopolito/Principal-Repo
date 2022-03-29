package com.solvd.deliveryService.Exceptions;

public class DriverNotFoundException extends RuntimeException{
    public DriverNotFoundException(String messageDriverNotFound){
        super(messageDriverNotFound);
    }
}
