public abstract class Driver<A extends Cars & Competing> {

    private String name;
    private boolean isDriverLicense = true;
    private int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        setName(name);
        setDriverLicense(driverLicense);
        setExperience(experience);
    }

    public abstract void start(A cars);
    public abstract void stop(A cars);
    public abstract void refill(A cars);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Информация о водителе: " +
                "ФИО " + name +
                ", наличие лицензии " + isDriverLicense +
                ", стаж вождения " + experience +
                " лет.";
    }
}
