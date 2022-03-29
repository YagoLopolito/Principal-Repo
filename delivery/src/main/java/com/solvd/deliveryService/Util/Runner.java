package com.solvd.deliveryService.Util;

import com.solvd.deliveryService.Exceptions.VehicleNotFoundException;
import com.solvd.deliveryService.people.Client;
import com.solvd.deliveryService.people.Employee;
import com.solvd.deliveryService.store.Central;
import com.solvd.deliveryService.store.Garage;
import com.solvd.deliveryService.store.Order;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Order order = new Order();
        Client client = new Client(20, "M", 43583051, "Yago Lopolito", order);
        Employee employee = new Employee(25, "M", 41264879, "Juan Roman Riquelme", 2000, 001, "Boss");
        Employee employee2 = new Employee(23, "M", 42164479, "Martin Palermo", 1500, 002, "Manager");

        Central central = new Central();
        central.createNewDriver(23, "M", 42354984, "Guillermo Barros Schelotto", false, 500, 1, "Driver");
        central.createNewDriver(54, "M", 30569847, "Hugo Moyano", true, 1500, 2, "Truck Driver");
        central.createNewTrainDriver(69, "F", 25693298, "Elsa Carrio", true, 2000, 3, "Train Driver");
        central.setGarage(garage);


        central.createNewMotorcycle(1, "Mercedes Benz", "Chipre", 3, 2, true, 3);
        central.createNewSUV(2, "Honda", "Kizx", 4, 5, 80);
        central.createNewPickup(3, "Ford", "Carlx", 4, 5, 100, true);
        central.createNewTruck(4, "Volvo", "Liga Argentina", true, 8, 2, 1000);
        central.createNewTrain(5, "Horse", "Bala", 80, 1000, 100000, true, false);


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the package weight in kg: ");

        boolean pass = false;
        int packageWeight = scanner.nextInt();

        while (pass == false) {

            if (packageWeight <= 3 && packageWeight > 0) {

                System.out.println("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + garage.getParkedVehicles().get(0));
                pass = true;
            } else if (packageWeight >= 3 && packageWeight <= 80) {

                System.out.println("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + garage.getParkedVehicles().get(1));
                pass = true;
            } else if (packageWeight > 80 && packageWeight <= 100) {
                System.out.println("Your delivery will be handled by " + central.getDriverList().get(0).getName() + " and he will be riding a " + garage.getParkedVehicles().get(2));
                pass = true;
            } else if (packageWeight > 100 && packageWeight <= 1000) {
                System.out.println("Your delivery will be handled by " + central.getDriverList().get(1).getName() + " and he will be riding a " + garage.getParkedVehicles().get(3));
            }
            else if(packageWeight >1000 && packageWeight <=100000){
                System.out.println("Your delivery will be handled by " + central.getTrainDriverList().get(0).getName() + " and he will be riding a " + central.getVehicleList().get(4));
                pass=true;
            }
            else{
                System.out.println("We do not have a capable vehicle");
                pass=false;
            }
        }


        System.out.println("Enter the distance to destination in km: ");
        Scanner scanner2 = new Scanner(System.in);
        order.setDistance(scanner2.nextDouble());


        System.out.println("The price is: $" + order.calculateCost(packageWeight) + "\n");
        System.out.println(central.getGarage().toString() + "\n");

        //System.out.println(transport.calculateCost(250, 200));
        //System.out.println(central.getVehicleList().get(0).toString());
    }

}

