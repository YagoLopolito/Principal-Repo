package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.enum1.Vehicles;
import com.solvd.DeliveryService.model.interface1.IRepair;

public class Motorcycle extends Vehicle implements IRepair {
    private boolean hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(int id, String brand, boolean hasSidecar, double capability, int speed) {
        super(id, brand, capability, speed);
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
        return "\n"
                + Vehicles.MOTORCYCLE
                + ":"
                + "\n"
                + super.toString()
                + ", Has Sidecar: "
                + hasSidecar
                + "\n";
    }

    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable(String nameMechanic) {
        System.out.println("Repair in the garage: "+ nameMechanic);
    }
}
