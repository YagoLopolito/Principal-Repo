package com.solvd.DeliveryService.model.exception;

public class DriverNotFoundException extends RuntimeException {
    public DriverNotFoundException(String messageDriverNotFound) {
        super(messageDriverNotFound);
    }
}
