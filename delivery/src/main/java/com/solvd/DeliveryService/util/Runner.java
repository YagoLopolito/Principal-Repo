package com.solvd.DeliveryService.util;

import com.solvd.DeliveryService.model.exception.DriverNotFoundException;
import com.solvd.DeliveryService.model.exception.NoCapableVehicleException;
import com.solvd.DeliveryService.model.exception.VehicleNotFoundException;
import com.solvd.DeliveryService.model.people.Client;
import com.solvd.DeliveryService.model.people.Employee;
import com.solvd.DeliveryService.model.store.Central;
import com.solvd.DeliveryService.model.store.Garage;
import com.solvd.DeliveryService.model.store.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

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


        central.createNewMotorcycle(1, "Mercedes Benz", "Chipre", 3, 2, true, 3, 150);
        central.createNewSUV(2, "Honda", "Kizx", 4, 5, 80, 100);
        central.createNewPickup(3, "Ford", "Carlx", 4, 5, 100, true, 200);
        central.createNewTruck(4, "Volvo", "Liga Argentina", true, 8, 2, 1000, 130);
        central.createNewTrain(5, "Horse", "Bala", 80, 1000, 100000, true, false, 180);


        Scanner scanner = new Scanner(System.in);

        int packageWeight = 0;
        boolean pass = false;
        while (pass == false) {
            log.info("Enter the package weight in kg: ");
            packageWeight = scanner.nextInt();

            try {
                pass = order.assignDriver(central, packageWeight);
            } catch (NoCapableVehicleException e) {
                log.info(e);
            }
        }


        log.info("Enter the distance to destination in km: ");
        Scanner scanner2 = new Scanner(System.in);

        order.setDistance(scanner2.nextDouble());


        log.info("The price is: $" + order.calculateCost(packageWeight) + "\n");
        log.info(central.getGarage().toString() + "\n");
        try {
            Scanner expScanner = new Scanner(System.in);
            log.info(central.searchVehicle(1).toString());
            central.searchVehicle(26).toString();
        } catch (VehicleNotFoundException e) {
            log.info(e);

        }
        try {
            Scanner exp2Scanner = new Scanner(System.in);
            log.info(central.searchDriver("Minguito").toString());
        } catch (DriverNotFoundException e) {
            log.info(e);
        }
    }
}

