package com.solvd.DeliveryService.model.people;

public class Mechanic extends Employee{
    public Mechanic(int age, String sex, int document, String name, double wage, int employeeId, String position) {
        super(age, sex, document, name, wage, employeeId, position);
    }

    @Override
    public String toString() {
        return "Mechanic: " + super.toString();
    }

}
