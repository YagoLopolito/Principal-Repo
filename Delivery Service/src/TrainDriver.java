public class TrainDriver extends Person {
    private boolean hasTrainLicense;

    public TrainDriver(int age, String sex, int document, String name, boolean hasTrainLicense) {
        super(age, sex, document, name);
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
        return "TrainDriver: " +
                "Has train license: " + hasTrainLicense +
                 super.toString() + "\n";
    }
}

