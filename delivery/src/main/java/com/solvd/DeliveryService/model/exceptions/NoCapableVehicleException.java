package com.solvd.DeliveryService.model.exceptions;

public class NoCapableVehicleException extends RuntimeException {
    public NoCapableVehicleException(String messageNoCapableVehicle) {
        super(messageNoCapableVehicle);
    }
}
