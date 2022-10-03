public class DriverD<A extends Bus & Competing> extends Driver {

    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }


    public void start(A bus) {
        System.out.print(this.getName() + " на ");
        bus.startMoving();
    }


    public void stop(A bus) {
        System.out.print(this.getName() + " на ");
        bus.finishMoving();
    }


    public void refill(A bus) {
        System.out.print(this.getName() + " на ");
        bus.pitStop();
    }

    public void getInTheCar(A bus) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + bus.getBrand() + " "
                + bus.getModel() + " и будет участвовать в заезде.");
    }
}
