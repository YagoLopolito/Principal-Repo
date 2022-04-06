package com.solvd.DeliveryService.model.store;

import com.solvd.DeliveryService.model.exception.DriverNotFoundException;
import com.solvd.DeliveryService.model.exception.VehicleNotFoundException;
import com.solvd.DeliveryService.model.people.Driver;
import com.solvd.DeliveryService.model.people.TrainDriver;
import com.solvd.DeliveryService.model.vehicles.*;

import java.util.ArrayList;

public class Central {
    private Garage garage;
    private String country;
    private String city;
    private ArrayList<Driver> driverList;
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Order> transportsList;
    private ArrayList<TrainDriver> trainDriverList;


    public Central() {
        this.driverList = new ArrayList<Driver>();
        this.transportsList = new ArrayList<Order>();
        this.vehicleList = new ArrayList<Vehicle>();
        this.garage = new Garage();
        this.trainDriverList = new ArrayList<TrainDriver>();
    }

    public void createNewTrain(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasWagon, boolean hasPassangers, int speed) {
        Train train = new Train(id, brand, model, wheels, capacity, capability, hasWagon, hasPassangers, speed);
        this.vehicleList.add(train);
        this.garage.getParkedVehicles().add(train);
    }

    public void createNewDriver(int age, String sex, int document, String name, boolean hasTruckLicense, double wage, int employeeId, String position) {
        Driver driver = new Driver(age, sex, document, name, hasTruckLicense, wage, employeeId, position);
        this.driverList.add(driver);

    }

    public void createNewTrainDriver(int age, String sex, int document, String name, boolean hasTrainLicense, double wage, int employeeId, String position) {
        TrainDriver trainDriver = new TrainDriver(age, sex, document, name, hasTrainLicense, wage, employeeId, position);
        this.trainDriverList.add(trainDriver);
    }

    public void createNewMotorcycle(int id, String brand, String model, int wheels, int capacity, boolean hasSidecar, double capability, int speed) {
        Motorcycle motorcycle = new Motorcycle(id, brand, model, wheels, capacity, hasSidecar, capability, speed);
        this.vehicleList.add(motorcycle);
        this.garage.getParkedVehicles().add(motorcycle);
    }

    public void createNewSUV(int id, String brand, String model, int wheels, int capacity, double capability, int speed) {
        SUV suv = new SUV(id, brand, model, wheels, capacity, capability, speed);
        this.vehicleList.add(suv);
        this.garage.getParkedVehicles().add(suv);
    }

    public void createNewPickup(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasTruckBed, int speed) {
        Pickup pickup = new Pickup(id, brand, model, wheels, capacity, capability, hasTruckBed, speed);
        this.vehicleList.add(pickup);
        this.garage.getParkedVehicles().add(pickup);
    }

    public void createNewTruck(int id, String brand, String model, boolean hasTrailer, int wheels, int capacity, double capability, int speed) {
        Truck truck = new Truck(id, brand, model, hasTrailer, wheels, capacity, capability, speed);
        this.vehicleList.add(truck);
        this.garage.getParkedVehicles().add(truck);
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

    public ArrayList<TrainDriver> getTrainDriverList() {
        return trainDriverList;
    }

    public void setTrainDriverList(ArrayList<TrainDriver> trainDriverList) {
        this.trainDriverList = trainDriverList;
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
