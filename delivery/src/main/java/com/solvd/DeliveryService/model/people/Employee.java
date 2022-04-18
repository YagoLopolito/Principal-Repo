package com.solvd.DeliveryService.model.people;

import com.solvd.DeliveryService.model.interface1.ICashSalary;
import com.solvd.DeliveryService.model.interface1.IEmployees;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends Person implements ICashSalary, IEmployees {
    private double wage;
    private int employeeId;
    private String position;
    private ArrayList<Employee> employeeList;

    public Employee(int age, String sex, int document, String name) {
        super(age, sex, document, name);
    }

    public Employee(int age, String sex, int document, String name, double wage, int employeeId, String position) {
        super(age, sex, document, name);
        this.wage = wage;
        this.position = position;
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
    public void setEmployeeList(ArrayList<Employee> employeeList){
        this.employeeList=employeeList;
    }

    @Override
    public String toString() {
        return "Employee " + "ID: " + employeeId +
                " Wage: $" + wage + " " +
                super.toString();
    }

    @Override
    public void cashSalary(int employeeId) {
        Iterator<Employee> it = this.employeeList.iterator();
        while (it.hasNext()){
             Employee employee=it.next();
             if(employee.getEmployeeId()==employeeId){
                 System.out.println("Wage: "+employee.getWage());
             }
        }
    }
}
