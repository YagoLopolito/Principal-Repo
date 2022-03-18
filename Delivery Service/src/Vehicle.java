public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int wheels;
    private int capacity;
    //private double price;
    private double capability;

    public Vehicle() {
    }

    public Vehicle(int id, String brand, String model, int wheels, int capacity, double capability) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.capacity = capacity;
        //this.price = price;
        this.capability = capability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCapability() {
        return capability;
    }

    public void setCapability(double capability) {
        this.capability = capability;
    }

    @Override
    public String toString() {
        return " Vehicle: " +
                "Id n°: " + id +
                ", Brand: " + brand +
                ", Model: " + model +
                ", N° of wheels: " + wheels +
                ", Capacity: " + capacity + " people"+
                ", Capability: " + capability + " kg" + "\n";

    }
}
