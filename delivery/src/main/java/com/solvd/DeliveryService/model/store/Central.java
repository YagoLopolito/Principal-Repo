package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.exception.DriverNotFoundException;
import com.solvd.DeliveryService.model.exception.VehicleNotFoundException;
import com.solvd.DeliveryService.model.people.Driver;
import com.solvd.DeliveryService.model.vehicle.*;

import java.util.ArrayList;

public class Central {
    private Garage garage;
    private ArrayList<Driver> driverList;
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Order> transportsList;

    public Central() {
        this.driverList = new ArrayList<Driver>();
        this.transportsList = new ArrayList<Order>();
        this.vehicleList = new ArrayList<Vehicle>();
        this.garage = new Garage();
    }

    public void addNewDriver(Driver driver) {
        this.driverList.add(driver);
    }

    public void addNewSuv(SUV suv) {
        this.vehicleList.add(suv);
    }

    public void addNewTruck(Truck truck) {
        this.vehicleList.add(truck);
    }

    public void addNewPickup(Pickup pickup) {
        this.vehicleList.add(pickup);
    }

    public void addNewMoto(Motorcycle motorcycle) {
        this.vehicleList.add(motorcycle);
    }

    public Vehicle getVehicle(int id) {
        int i = 0;
        Vehicle returnedVehicle = null;
        while (vehicleList.get(i).getId() != id) {
            if (vehicleList.get(i).getId() == id) {
                returnedVehicle = vehicleList.get(i);
            } else {
                i++;
            }
        }
        return returnedVehicle;
    }

    public Driver getDriver(int id) {
        int i = 0;
        Driver returnedDriver = null;
        while (driverList.get(i).getEmployeeId() != id) {
            if (vehicleList.get(i).getId() == id) {
                returnedDriver = driverList.get(i);
            } else {
                i++;
            }
        }
        return returnedDriver;
    }

    public double getCapabilityById(int id) {
        int i = 0;
        double capability = 0;
        while (vehicleList.get(i).getId() != id) {
            if (vehicleList.get(i).getId() == id) {
                capability = vehicleList.get(i).getCapability();
            } else {
                i++;
            }
        }
        return capability;
    }

    public Vehicle searchVehicle(int id) {
        for (Vehicle a : this.vehicleList) {
            if (a.getId() == id) {
                return a;
            }
        }
        throw new VehicleNotFoundException("That vehicle doesn´t exist ");
    }

    public Driver searchDriver(String name) {
        for (Driver a : this.driverList) {
            if (a.getName() == name) {
                return a;
            }
        }
        throw new DriverNotFoundException("That driver doesn´t exist ");
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public ArrayList<Order> getTransportsList() {
        return transportsList;
    }

    public void setTransportsList(ArrayList<Order> transportsList) {
        this.transportsList = transportsList;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Vehicle in the central, "
                + "Parked in the: "
                + garage
                + ", Driver List: "
                + driverList
                + ", Vehicle List: "
                + vehicleList
                + ", Transports List: "
                + transportsList
                + "\n"
                ;
    }
}
