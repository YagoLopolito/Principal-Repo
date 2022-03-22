package com.solvd.deliveryService;

import com.solvd.deliveryService.people.Driver;
import com.solvd.deliveryService.vehicles.*;

import java.util.ArrayList;

public class Central {
    private Garage garage;
    private String country;
    private String city;
    private ArrayList<Driver> driverList;
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Order> transportsList;

    public Central() {
        this.driverList = new ArrayList<Driver>();
        this.transportsList = new ArrayList<Order>();
        this.vehicleList = new ArrayList<Vehicle>();
        this.garage = new Garage();
    }

    public void createNewMotorcycle(int id, String brand, String model, int wheels, int capacity, boolean hasSidecar, double capability) {
        Motorcycle motorcycle = new Motorcycle(id, brand, model, wheels, capacity, hasSidecar, capability);
        this.vehicleList.add(motorcycle);
        this.garage.getParkedVehicles().add(motorcycle);
    }

    public void createNewSUV(int id, String brand, String model, int wheels, int capacity, double capability) {
        SUV suv = new SUV(id, brand, model, wheels, capacity, capability);
        this.vehicleList.add(suv);
        this.garage.getParkedVehicles().add(suv);
    }

    public void createNewPickup(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasTruckBed) {
        Pickup pickup = new Pickup(id, brand, model, wheels, capacity, capability, hasTruckBed);
        this.vehicleList.add(pickup);
        this.garage.getParkedVehicles().add(pickup);
    }

    public void createNewTruck(int id, String brand, String model, boolean hasTrailer, int wheels, int capacity, double capability) {
        Truck truck = new Truck(id, brand, model, hasTrailer, wheels, capacity, capability);
        this.vehicleList.add(truck);
        this.garage.getParkedVehicles().add(truck);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return "Vehicle in the central, " +
                "Parked in the: " + garage +
                ", Driver List: " + driverList +
                ", Vehicle List: " + vehicleList +
                ", Transports List: " + transportsList + "\n"

                ;
    }
}
