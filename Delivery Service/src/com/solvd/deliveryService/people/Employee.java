package com.solvd.deliveryService.people;

import com.solvd.deliveryService.interfaces.Bonus;

public class Employee extends Person implements Bonus {
    private double wage;
    private int employeeId;

    public Employee(int age, String sex, int document, String name) {
        super(age, sex, document, name);
    }

    public Employee(int age, String sex, int document, String name, double wage, int employeeId) {
        super(age, sex, document, name);
        this.wage = wage;
        this.employeeId = employeeId;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee " + "ID: "+ employeeId +
                " Wage: $" + wage +
                super.toString();
    }
}
