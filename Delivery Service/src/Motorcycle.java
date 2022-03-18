public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(int id, String brand, String model, int wheels, int capacity, boolean hasSidecar, double capability) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle: " +
                "Has Sidecar: " + hasSidecar +
                  super.toString() + "\n";
    }
}
