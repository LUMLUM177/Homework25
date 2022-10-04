public class DriverD<A extends Bus & Competing> extends Driver {

    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }


    @Override
    public void start(Cars cars) {
        System.out.print(this.getName() + " на ");
        cars.startMoving();
    }

    @Override
    public void stop(Cars cars) {
        System.out.print(this.getName() + " на ");
        cars.finishMoving();
    }

    @Override
    public void refill(Cars cars) {
        System.out.print(this.getName() + " на ");
        cars.pitStop();
    }

    public void getInTheCar(A bus) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + bus.getBrand() + " "
                + bus.getModel() + " и будет участвовать в заезде.");
    }
}
