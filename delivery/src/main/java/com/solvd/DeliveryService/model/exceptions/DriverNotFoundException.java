package com.solvd.DeliveryService.model.exceptions;

public class DriverNotFoundException extends RuntimeException {
    public DriverNotFoundException(String messageDriverNotFound) {
        super(messageDriverNotFound);
    }
}
