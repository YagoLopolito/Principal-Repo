package com.solvd.DeliveryService.util;

import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.exception.DriverNotFoundException;
import com.solvd.DeliveryService.model.exception.NoCapableVehicleException;
import com.solvd.DeliveryService.model.exception.VehicleNotFoundException;
import com.solvd.DeliveryService.model.people.Client;
import com.solvd.DeliveryService.model.people.Driver;
import com.solvd.DeliveryService.model.people.Mechanic;
import com.solvd.DeliveryService.model.store.Central;
import com.solvd.DeliveryService.model.store.Order;
import com.solvd.DeliveryService.model.vehicle.Motorcycle;
import com.solvd.DeliveryService.model.vehicle.Pickup;
import com.solvd.DeliveryService.model.vehicle.SUV;
import com.solvd.DeliveryService.model.vehicle.Truck;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Runner {
    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        Order order = new Order();
        Central central = new Central();
        DetailsGeneric<Integer, String , Double, Integer> details =new DetailsGeneric<>();
        details.setId(2);
        details.setBrand("Honda");
        details.setCapability(80.0);
        details.setSpeed(50);
        SUV suv1 = new SUV(details.getId(), details.getBrand(), details.getCapability(), details.getSpeed());
        suv1.setDetails(details);
        Driver driver1 = new Driver(23, "M", 42354984, "Guillermo Barros Schelotto", false, 500, 1, "Driver");
        central.addNewDriver(driver1);
        central.addNewSuv(suv1);
        details.setId(22);
        details.setBrand("Honda2");
        details.setCapability(81.0);
        details.setSpeed(51);

        Pickup pickup1 = new Pickup(details.getId(), "Ford", 100, true, 160);
        central.addNewPickup(pickup1);
        Motorcycle motorcycle1 = new Motorcycle(1, "Mercedes Benz", true, 3, 200);
        central.addNewMoto(motorcycle1);
        Truck truck1 = new Truck(4, "Volvo", true, 1000, 130);
        central.addNewTruck(truck1);
        Client client = new Client(20, "M", 43583051, "Yago Lopolito", order);
        Mechanic mechanic1 = new Mechanic(43, "m", 1463211, "paloma", 133, 03, "Mechanic");

        central.getGarage().getMechanicsList().add(mechanic1);
        mechanic1.parkVehicle(central, suv1);
        mechanic1.parkVehicle(central, truck1);
        mechanic1.parkVehicle(central, motorcycle1);
        mechanic1.parkVehicle(central, pickup1);

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


        log.info("\n --------------------------------------------------------------------------------------------- \n"
                + "The price is: $"
                + order.calculateCost(packageWeight)
                + "\n"
                + "Estimated time of arrival: "
                + order.estimatedTimeOfArrival()
                + " Hs."
                + "\n ---------------------------------------------------------------------------------------------\n");

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

