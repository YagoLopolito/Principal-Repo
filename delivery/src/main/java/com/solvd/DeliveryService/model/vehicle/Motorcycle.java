package com.solvd.DeliveryService.model.vehicle;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(int id, String brand, String model, int wheels, int capacity, boolean hasSidecar, double capability, int speed) {
        super(id, brand, model, wheels, capacity, capability, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "\n" + "-Motorcycle " +
                super.toString() +
                "Has Sidecar: " + hasSidecar +
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
