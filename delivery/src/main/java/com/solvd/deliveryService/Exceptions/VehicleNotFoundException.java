package com.solvd.deliveryService.Exceptions;

public class VehicleNotFoundException extends RuntimeException {
public VehicleNotFoundException(String messageVehicleNotFound){
    super(messageVehicleNotFound);
}
}

