package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.enum1.Vehicles;

public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(int id, String brand, boolean hasTrailer, double capability, int speed) {
        super(id, brand, capability, speed);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "\n"
                + Vehicles.TRUCK
                + ":"
                + "\n"
                + super.toString()
                + ", Has trailer: "
                + hasTrailer
                + "\n";
    }



    @Override
    public void setDetails(DetailsGeneric details) {

    }
}