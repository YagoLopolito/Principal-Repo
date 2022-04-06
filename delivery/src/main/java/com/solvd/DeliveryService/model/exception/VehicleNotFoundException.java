package com.solvd.DeliveryService.model.exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String messageVehicleNotFound) {
        super(messageVehicleNotFound);
    }
}

