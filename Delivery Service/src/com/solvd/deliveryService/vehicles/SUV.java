package com.solvd.deliveryService.vehicles;

public class SUV extends Vehicle {
    public SUV() {
    }

    public SUV(int id, String brand, String model, int wheels, int capacity, double capability) {
        super(id, brand, model, wheels, capacity, capability);
    }

    @Override
    public String toString() {
        return "SUV " + super.toString() + "\n";
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