public class Train extends Vehicle {
    private boolean hasWagon;
    private boolean hasPassangers;

    public Train() {
    }

    public Train(int id, String brand, String model, int wheels, int capacity, double capability, boolean hasWagon, boolean hasPassangers) {
        super(id, brand, model, wheels, capacity, capability);
        this.hasWagon = hasWagon;
        this.hasPassangers = hasPassangers;
    }

    public boolean isHasWagon() {
        return hasWagon;
    }

    public void setHasWagon(boolean hasWagon) {
        this.hasWagon = hasWagon;
    }

    public boolean isHasPassangers() {
        return hasPassangers;
    }

    public void setHasPassangers(boolean hasPassangers) {
        this.hasPassangers = hasPassangers;
    }

    @Override
    public String toString() {
        return "Train: " +
                "Has Wagon: " + hasWagon +
                ", Has Passangers: " + hasPassangers +
                  super.toString() + "\n";
    }
}
