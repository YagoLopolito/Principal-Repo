package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.Vehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IRepair;

public class Pickup extends Vehicle implements IRepair {
    private boolean hasTruckBed;

    public Pickup() {
    }

    public Pickup(int id, String brand, double capability, boolean hasTruckBed, int speed) {
        super(id, brand, capability, speed);
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
        return "\n"
                + Vehicles.PICKUP
                + ":"
                + "\n"
                + super.toString()
                + ", Has truck bed: "
                + hasTruckBed
                + "\n";

    }

    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable(String nameMechanic) {
        System.out.println("Repair in the garage: " + nameMechanic);
    }
}

