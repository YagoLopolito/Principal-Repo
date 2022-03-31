package com.solvd.DeliveryService.model.vehicles;

public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(int id, String brand, String model, boolean hasTrailer, int wheels, int capacity, double capability) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "-Truck " + super.toString() +
                "Has trailer: " + hasTrailer +
                "\n";
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
