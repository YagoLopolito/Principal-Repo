public class Driver extends Person {
    private boolean hasTruckLicense;

    public Driver(int age, String sex, int document, String name) {
        super(age, sex, document, name);
    }

    public Driver(int age, String sex, int document, String name, boolean hasTruckLicense) {
        super(age, sex, document, name);
        this.hasTruckLicense = hasTruckLicense;
    }

    public boolean isHasTruckLicense() {
        return hasTruckLicense;
    }

    public void setHasTruckLicense(boolean hasTruckLicense) {
        this.hasTruckLicense = hasTruckLicense;
    }

    @Override
    public String toString() {
        return "Driver: " +
                "Has Truck License: " + hasTruckLicense +
                 super.toString() + "\n";
    }
}

