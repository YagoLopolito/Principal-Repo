package com.solvd.DeliveryService.model.exceptions;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String messageVehicleNotFound) {
        super(messageVehicleNotFound);
    }
}

