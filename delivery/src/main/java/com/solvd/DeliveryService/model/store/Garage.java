package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.people.Driver;
import com.solvd.DeliveryService.model.people.Mechanic;
import com.solvd.DeliveryService.model.vehicle.Vehicle;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Garage {
    private LinkedList<Vehicle> parkedVehicles;
    private Set<Mechanic> mechanicsList;


    public Garage() {
        this.parkedVehicles = new LinkedList<Vehicle>();
        this.mechanicsList = new HashSet<Mechanic>();
    }
    public Set<Mechanic> getMechanicsList() { return mechanicsList;}
    public LinkedList<Vehicle> getParkedVehicles() {
        return parkedVehicles;
    }

    public void setParkedVehicles(LinkedList<Vehicle> parkedVehicles) {
        this.parkedVehicles = parkedVehicles;
    }

    public void setMechanicsList(Set<Mechanic> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }
    public void createNewMechanic(int age, String sex, int document, String name, double wage, int employeeId, String position) {
        Mechanic mechanic = new Mechanic(age, sex, document, name, wage, employeeId, position);
        mechanicsList.add(mechanic);
    }


    @Override
    public String toString() {
        return "Garage" +
                " Parked Vehicles: " + parkedVehicles + "\n"
                + "The Mechanics in the garage are: " + mechanicsList + "\n";

    }

}
