public class SUV extends Vehicle {
    public SUV() {
    }

    public SUV(int id, String brand, String model, int wheels, int capacity, double capability) {
        super(id, brand, model, wheels, capacity, capability);
    }

    @Override
    public String toString() {
        return "SUV: " + super.toString() + "\n";
    }
}
