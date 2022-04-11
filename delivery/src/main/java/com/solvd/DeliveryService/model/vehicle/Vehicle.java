package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.interface1.IMoveForware;
import com.solvd.DeliveryService.model.interface1.IUseLights;
import com.solvd.DeliveryService.model.interface1.IUseWindows;


public abstract class Vehicle implements IMoveForware, IUseLights, IUseWindows {
    private int id;
    private String brand;
    private String model;
    private int wheels;
    private int capacity;
    private double capability;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(int id, String brand, String model, int wheels, int capacity, double capability, int speed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.capacity = capacity;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
                "id n°: " + id +
                        ", Brand: " + brand +
                        ", Model: " + model +
                        ", N° of wheels: " + wheels +
                        ", Capacity: " + capacity + " people" +
                        ", Capability: " + capability + " kg" + "\n";

    }
}
