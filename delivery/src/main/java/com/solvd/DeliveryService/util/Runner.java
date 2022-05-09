package com.solvd.DeliveryService.util;

import com.solvd.DeliveryService.model.exception.NoCapableVehicleException;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.generic.GenericClientDetails;
import com.solvd.DeliveryService.model.generic.GenricInteger;
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

        DetailsGeneric<Integer, String, Double, Integer> details = new DetailsGeneric<>();
        details.setId(2);
        details.setBrand("Honda");
        details.setCapability(80.0);
        details.setSpeed(50);
        SUV suv1 = new SUV(details.getId(), details.getBrand(), details.getCapability(), details.getSpeed());
        suv1.setDetails(details);
        central.addNewSuv(suv1);
        Pickup pickup1 = new Pickup(details.getId(), "Ford", 100, true, 60);
        central.addNewPickup(pickup1);
        Motorcycle motorcycle1 = new Motorcycle(1, "Mercedes Benz", true, 3, 120);
        central.addNewMoto(motorcycle1);
        Truck truck1 = new Truck(4, "Volvo", true, 1000, 30);
        central.addNewTruck(truck1);

        GenericClientDetails<Integer, String, Integer, String> gcd = new GenericClientDetails<>();
        gcd.setAge(20);
        gcd.setSex("M");
        gcd.setDocument(43969678);
        gcd.setName("Yago Lopolito");
        Client client = new Client(gcd.getAge(), gcd.getSex(), gcd.getDocument(), gcd.getName());


        Mechanic mechanic1 = new Mechanic(43, "M", 14632111, "Paloma Roncaglia", 133, 3, "Mechanic");
        Driver driver1 = new Driver(23, "M", 42354984, "Guillermo Barros Schelotto", false, 499, 1, "Driver");
        central.addNewDriver(driver1);

        central.getGarage().getMechanicsList().add(mechanic1);
        mechanic1.parkVehicle(central, suv1);
        mechanic1.parkVehicle(central, truck1);
        mechanic1.parkVehicle(central, motorcycle1);
        mechanic1.parkVehicle(central, pickup1);


        log.info("\n¡Hello " + client);

        Scanner scanner = new Scanner(System.in);

        new Thread(() -> {

            int packageWeight = 0;
            boolean pass = false;
            GenricInteger<Integer> gd;

            while (!pass) {

                log.info("\nEnter the package weight in kg: ");
                packageWeight = scanner.nextInt();
                gd = new GenricInteger<>(packageWeight);
                try {
                    pass = order.assignDriver(central, gd.getInteger());
                } catch (NoCapableVehicleException e) {
                    log.info(e);
                }
            }

            log.info("\nEnter the distance to destination in km: ");
            Scanner scanner3 = new Scanner(System.in);

            gd = new GenricInteger<>(packageWeight);

            order.setDistance(scanner3.nextDouble());

            log.info("\n----------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + client
                    + "The price is: $"
                    + order.calculateCost(gd.getInteger())
                    + "\n"
                    + "Estimated time of arrival: "
                    + order.estimatedTimeOfArrival()
                    + " Minutes."
                    + "\n----------------------------------------------------------------------------------------------------------------------------------------------\n");
            log.info("Pay order? 1= Yes 2= No\n");

            Scanner scanner4 = new Scanner(System.in);
            boolean pay = false;

            while (!pay) {
                switch (scanner4.nextInt()) {
                    case 1:
                        order.pay();
                        log.info(central.getGarage().toString()
                                + "\n----------------------------------------------------------------------------------------------------------------------------------------------\n"
                                + "Driver "
                                + driver1.getName()
                                + " wage: $ "
                                + (driver1.getWage() + (order.calculateCost(packageWeight) * 20) / 100)
                                + "\n----------------------------------------------------------------------------------------------------------------------------------------------\n"
                                + "Is paid: "
                                + order.isPago());
                        pay = true;
                        break;
                    case 2:
                        log.info("Shipment will not be made until payment is made.\n");
                        log.info("Pay order? 1= Yes 2= No\n");
                        break;
                    default:
                        log.info("You can only use 1 and 2!\n");
                        log.info("Pay order? 1= Yes 2= No\n");
                }
            }
        }).start();
    }
}