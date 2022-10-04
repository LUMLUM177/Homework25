public class DriverC<A extends Trucks & Competing> extends Driver<A> {

    public DriverC(String name, boolean driverLicense, int experience) {
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

    public void getInTheCar(A trucks) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + trucks.getBrand() + " "
                + trucks.getModel() + " и будет участвовать в заезде.");
    }
}
