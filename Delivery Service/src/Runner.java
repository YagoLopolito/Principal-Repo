import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Order order = new Order();
        Client client = new Client(20, "M", 43583051, "Yago Lopolito", order);


        Central central = new Central();
        central.setGarage(garage);

        central.createNewMotorcycle(1001, "Mercedes Benz", "Chipre", 3, 2, true, 3);
        central.createNewPickup(001, "Ford", "Carlx", 4, 5, 100, true);
        central.createNewSUV(002, "Honda", "Kizx", 4, 5, 80);
        central.createNewTruck(003, "Volvo", "Liga Argentina", true, 8, 2, 1000);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the package weight in kg: ");


        int packageWeight = scanner.nextInt();

        System.out.println("Enter the distance to destination in km: ");
        Scanner scanner2 = new Scanner(System.in);
        order.setDistance(scanner2.nextDouble());


        System.out.println("The price is: $" + order.calculateCost(packageWeight));
        System.out.println(central.getGarage().toString());

        //System.out.println(transport.calculateCost(250, 200));
        //System.out.println(central.getVehicleList().get(0).toString());
    }
}

