package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IDetails;


public abstract class Vehicle implements IDetails {
    private int id;
    private String brand;
    private double capability;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(int id, String brand, double capability, int speed) {
        this.id = id;
        this.brand = brand;
        this.capability = capability;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapability() {
        return capability;
    }

    public void setCapability(double capability) {
        this.capability = capability;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                "id n°: "
                        + id
                        + ", Brand: "
                        + brand
                        + ", Capability: "
                        + capability
                        + " kg";
    }

    @Override
    public void setDetails(DetailsGeneric details) {

    }
}
