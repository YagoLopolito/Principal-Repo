package com.solvd.DeliveryService.model.store;


import com.solvd.DeliveryService.model.enum1.Vehicles;
import com.solvd.DeliveryService.model.exception.NoCapableVehicleException;
import com.solvd.DeliveryService.model.interface1.IOperate;
import com.solvd.DeliveryService.model.vehicle.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Order {
    private static final Logger log = LogManager.getLogger(Order.class);
    public final static double PRICE_PER_KM = 0.2;
    private double distance;
    private Vehicle assignedVehicle;
    private int price;

    public Order() {
    }

    public Order(double distance) {
        this.distance = distance;
    }

    public double calculateCost(int kg) {
        int weightClass = kg / 100;
        switch (weightClass) {
            case 0:
                price = 20;
                break;

            case 1:
                price = 30;
                break;

            case 2:
                price = 40;
                break;

            default:
                price = 70;
                break;
        }

        return price + this.distance * PRICE_PER_KM;
    }

    public int estimatedTimeOfArrival() {
        IOperate a = ((distance, speed) -> {
            int r = (distance / speed) * 60;
            return r;
        });
        return a.operate((int) this.distance, assignedVehicle.getSpeed());
    }

    public boolean assignDriver(Central central, int packageWeight) {
        boolean pass = false;
        new Thread(() -> {

        }).start();

        while (pass == false) {

            if (packageWeight <= 3 && packageWeight > 0) {

                log.info("\nYour delivery will be handled by "
                        + central.getDriverList().get(0).getName()
                        + " and he will be riding a " + Vehicles.MOTORCYCLE);
                this.assignedVehicle = central.getGarage().getParkedVehicles().get(0);
                return true;
            } else if (packageWeight >= 3 && packageWeight <= 80) {

                log.info("\nYour delivery will be handled by "
                        + central.getDriverList().get(0).getName()
                        + " and he will be riding a " + Vehicles.SUV);
                this.assignedVehicle = central.getGarage().getParkedVehicles().get(1);
                return true;
            } else if (packageWeight > 80 && packageWeight <= 100) {
                log.info("\nYour delivery will be handled by "
                        + central.getDriverList().get(0).getName()
                        + " and he will be riding a " + Vehicles.PICKUP);
                this.assignedVehicle = central.getGarage().getParkedVehicles().get(2);
                return true;
            } else if (packageWeight > 100 && packageWeight <= 1000) {

                log.info("\nYour delivery will be handled by "
                        + central.getDriverList().get(0).getName()
                        + " and he will be riding a " + Vehicles.TRUCK);
                this.assignedVehicle = central.getGarage().getParkedVehicles().get(3);
                return true;

            } else {
                throw new NoCapableVehicleException("\nWe do not have a capable vehicle");
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
        return "Price per kilometer: $"
                + PRICE_PER_KM
                + ", Distance: "
                + distance
                + " Km"
                + ", Assigned vehicle: "
                + assignedVehicle
                + "\n"
                ;
    }
}

