package com.solvd.deliveryService.people;

public class Driver extends Employee {
    private boolean hasTruckLicense;

    public Driver(int age, String sex, int document, String name, double wage, int employeeId) {
        super(age, sex, document, name, wage, employeeId);
    }

    public Driver(int age, String sex, int document, String name, boolean hasTruckLicense, double wage, int employeeId) {
        super(age, sex, document, name, wage, employeeId);
        this.hasTruckLicense = hasTruckLicense;
    }

    public boolean isHasTruckLicense() {
        return hasTruckLicense;
    }

    public void setHasTruckLicense(boolean hasTruckLicense) {
        this.hasTruckLicense = hasTruckLicense;
    }


    @Override
    public String toString() {
        return
                "Has Truck License: " + hasTruckLicense +
                super.toString() + "\n";
    }
}

