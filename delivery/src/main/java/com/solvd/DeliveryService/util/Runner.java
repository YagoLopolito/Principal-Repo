package com.solvd.DeliveryService.util;

import com.solvd.DeliveryService.model.exception.DriverNotFoundException;
import com.solvd.DeliveryService.model.exception.NoCapableVehicleException;
import com.solvd.DeliveryService.model.exception.VehicleNotFoundException;
import com.solvd.DeliveryService.model.people.Client;
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
        garage.setList();
        Order order = new Order();
        Central central = new Central();
        central.setList();
        Client client = new Client(20, "M", 43583051, "Yago Lopolito", order);

        log.info(client.toString());
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


        log.info("The price is: $"
                + order.calculateCost(packageWeight)
                + "\n");
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

