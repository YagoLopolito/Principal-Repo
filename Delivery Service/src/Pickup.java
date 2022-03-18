public class Pickup extends Vehicle {
    private boolean hasTruckBed;

    public Pickup() {
    }

    public Pickup(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasTruckBed) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasTruckBed = hasTruckBed;
    }

    public boolean isHasTruckBed() {
        return hasTruckBed;
    }

    public void setHasTruckBed(boolean hasTruckBed) {
        this.hasTruckBed = hasTruckBed;
    }

    @Override
    public String toString() {
        return "Pickup: " +
                "Has truck bed: " + hasTruckBed +
                super.toString() + "\n";
    }
}

