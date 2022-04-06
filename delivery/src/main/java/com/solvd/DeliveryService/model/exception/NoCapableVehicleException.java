package com.solvd.DeliveryService.model.exception;

public class NoCapableVehicleException extends RuntimeException {
    public NoCapableVehicleException(String messageNoCapableVehicle) {
        super(messageNoCapableVehicle);
    }
}
