package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.vehicles.Vehicle;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> parkedVehicles;

    public Garage() {
        this.parkedVehicles = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getParkedVehicles() {
        return parkedVehicles;
    }

    public void setParkedVehicles(ArrayList<Vehicle> parkedVehicles) {
        this.parkedVehicles = parkedVehicles;
    }

    @Override
    public String toString() {
        return "Garage" +
                " Parked Vehicles: " + parkedVehicles + "\n"
                ;
    }
}
