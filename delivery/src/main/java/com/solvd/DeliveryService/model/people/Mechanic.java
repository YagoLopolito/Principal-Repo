package com.solvd.DeliveryService.model.people;

import com.solvd.DeliveryService.model.store.Central;
import com.solvd.DeliveryService.model.vehicle.Vehicle;

public class Mechanic extends Employee {
    public Mechanic(int age, String sex, int document, String name, double wage, int employeeId, String position) {
        super(age, sex, document, name, wage, employeeId, position);
    }

    public void parkVehicle(Central central, Vehicle vehicle) {
        central.getGarage().getParkedVehicles().add(vehicle);

    }

    @Override
    public String toString() {
        return "Mechanic: " + super.toString();
    }

}
