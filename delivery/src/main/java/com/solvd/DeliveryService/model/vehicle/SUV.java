package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.Vehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IRepair;

public class SUV extends Vehicle implements IRepair {
    private DetailsGeneric<Integer, String, Double, Integer> details;

    public SUV() {
    }

    public SUV(int id, String brand, double capability, int speed) {
        super(id, brand, capability, speed);

    }

    @Override
    public String toString() {

        return "\n"
                + Vehicles.SUV
                + ":"
                + "\n"
                + super.toString()
                + "\n";
    }

    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable(String nameMechanic) {
        System.out.println("Repair in the garage by: ");
    }
}
