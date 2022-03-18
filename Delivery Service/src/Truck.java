public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(int id, String brand, String model, boolean hasTrailer, int wheels, int capacity, double capability) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "Truck: " +
                "Has trailer: " + hasTrailer +
                  super.toString() + "\n";
    }
}
