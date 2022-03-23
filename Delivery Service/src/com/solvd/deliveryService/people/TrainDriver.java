package com.solvd.deliveryService.people;

public class TrainDriver extends Employee {
    private boolean hasTrainLicense;

    public TrainDriver(int age, String sex, int document, String name, boolean hasTrainLicense, double wage, int employeeId, String position) {
        super(age, sex, document, name, wage, employeeId, position);
        this.hasTrainLicense = hasTrainLicense;
    }

    public boolean isHasTrainLicense() {
        return hasTrainLicense;
    }

    public void setHasTrainLicense(boolean hasTrainLicense) {
        this.hasTrainLicense = hasTrainLicense;
    }

    @Override
    public String toString() {
        return "The train driver " +
                "Has train license: " + hasTrainLicense +

                super.toString() + "\n";
    }
}

