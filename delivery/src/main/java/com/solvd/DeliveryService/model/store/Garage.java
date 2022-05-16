package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.people.Employee;
import com.solvd.DeliveryService.model.people.Mechanic;
import com.solvd.DeliveryService.model.vehicle.Vehicle;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Garage {
    private LinkedList<Vehicle> parkedVehicles;
    private Set<Mechanic> mechanicsList;

    public void setList() {
        createNewMechanic(48, "F", 12698369, "Juan Agustin Rodriguez", 300, 003, "Mechanic");
        Employee employee = new Employee(25, "M", 41264879, "Juan Roman Riquelme", 2000, 001, "Boss");
        Employee employee2 = new Employee(23, "M", 42164479, "Martin Palermo", 1500, 002, "Manager");

    }

    public Garage() {
        this.parkedVehicles = new LinkedList<Vehicle>();
        this.mechanicsList = new HashSet<Mechanic>();
    }

    public Set<Mechanic> getMechanicsList() {
        return mechanicsList;
    }

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
        return "\n----------------------------------------------------------------------------------------------------------------------------------------------\n"
                + "Garage parked vehicles:\n"
                + parkedVehicles
                + "\n----------------------------------------------------------------------------------------------------------------------------------------------\n"
                ;
    }
}

