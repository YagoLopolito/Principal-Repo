package com.solvd.deliveryService.vehicles;

public class Pickup extends Vehicle {
    private boolean hasTruckBed;

    public Pickup() {
    }

    public Pickup(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasTruckBed) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasTruckBed = hasTruckBed;
    }

    public boolean isHasTruckBed() {
        return hasTruckBed;
    }

    public void setHasTruckBed(boolean hasTruckBed) {
        this.hasTruckBed = hasTruckBed;
    }

    @Override
    public String toString() {
        return "-Pickup " + super.toString() + ", Has truck bed: " + hasTruckBed +
                "\n" + "\n";

    }

    @Override
    public void moveForward() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void lowBeamsHeadlights() {

    }

    @Override
    public void highBeamsHeadlights() {

    }

    @Override
    public void positionLights() {

    }

    @Override
    public void rollUp() {

    }

    @Override
    public void rollDown() {

    }
}

