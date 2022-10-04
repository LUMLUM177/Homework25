public class DriverB<A extends Auto & Competing> extends Driver<A> {

    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void start(A a) {
        System.out.print(this.getName() + " на ");
        a.startMoving();
    }

    @Override
    public void stop(A a) {
        System.out.print(this.getName() + " на ");
        a.finishMoving();
    }

    @Override
    public void refill(A a) {
        System.out.print(this.getName() + " на ");
        a.pitStop();
    }

    public void getInTheCar(A auto) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + auto.getBrand() + " "
                + auto.getModel() + " и будет участвовать в заезде.");
    }
}
