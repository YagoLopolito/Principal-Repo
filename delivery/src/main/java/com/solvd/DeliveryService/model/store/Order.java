package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.exceptions.NoCapableVehicleException;
import com.solvd.DeliveryService.model.vehicles.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Order {
    private static final Logger log = LogManager.getLogger(Order.class);
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

    public boolean assignDriver(Central central, int packageWeight) {
        boolean pass = false;

        while (pass == false) {

            if (packageWeight <= 3 && packageWeight > 0) {

                log.info("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + central.getGarage().getParkedVehicles().get(0));
                return true;
            } else if (packageWeight >= 3 && packageWeight <= 80) {

                log.info("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + central.getGarage().getParkedVehicles().get(1));
                return true;
            } else if (packageWeight > 80 && packageWeight <= 100) {
                log.info("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + central.getGarage().getParkedVehicles().get(2));
                return true;
            } else if (packageWeight > 100 && packageWeight <= 1000) {

                log.info("Your delivery will be handled by " + central.getDriverList().get(1).getName() + " and he will be riding a " + central.getGarage().getParkedVehicles().get(3));
                return true;
            } else if (packageWeight > 1000 && packageWeight <= 100000) {
                log.info("Your delivery will be handled by " + central.getTrainDriverList().get(0).getName() + " and he will be riding a " + central.getVehicleList().get(4));
                return true;
            } else {
                throw new NoCapableVehicleException("We do not have a capable vehicle");
            }
        }
        return false;
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

