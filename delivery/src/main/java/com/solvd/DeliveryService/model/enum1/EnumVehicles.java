package com.solvd.DeliveryService.model.enum1;

public enum EnumVehicles {
    MOTORCYCLE(1, "Motorcycle"),
    PICKUP(2, "Pickup"),
    SUV(3, "SUV"),
    TRUCK(4, "Truck");

    private final int number;
    private final String Vehicle;

    EnumVehicles(int number, String vehicle) {
        this.number = number;
        Vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public String getVehicle() {
        return Vehicle;
    }
}