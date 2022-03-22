package com.solvd.deliveryService;

import com.solvd.deliveryService.vehicles.Vehicle;

public class Order {
    private final double PRICE_PER_KM = 0.2;
    private double distance;
    private Vehicle assignedVehicle;
    public Order() {
    }

    public Order(double distance) {
        this.distance = distance;
    }

    public double calculateCost(int kg) {
        int weightClass = kg / 100;
        int price;
        switch (weightClass) {
            case 0:
                price = 10;
                break;

            case 1:
                price = 20;
                break;

            case 2:
                price = 30;
                break;

            default:
                price = 60;
                break;
        }
        return price + this.distance * PRICE_PER_KM;

    }

    public double getPRICE_PER_KM() {
        return PRICE_PER_KM;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle) {
        this.assignedVehicle = assignedVehicle;
    }

    @Override
    public String toString() {
        return
                "Price per kilometer: $" + PRICE_PER_KM +
                ", Distance: " + distance + " Km" +
                ", Assigned vehicle: " + assignedVehicle + "\n"
                ;
    }
}

