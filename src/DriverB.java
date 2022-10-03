public class DriverB<A extends Auto & Competing> extends Driver {

    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    public void start(A auto) {
        System.out.print(this.getName() + " на ");
        auto.startMoving();
    }

    public void stop(A auto) {
        System.out.print(this.getName() + " на ");
        auto.finishMoving();
    }

    public void refill(A auto) {
        System.out.print(this.getName() + " на ");
        auto.pitStop();
    }

    public void getInTheCar(A auto) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + auto.getBrand() + " "
                + auto.getModel() + " и будет участвовать в заезде.");
    }
}
