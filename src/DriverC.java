public class DriverC<A extends Trucks & Competing> extends Driver {

    public DriverC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }


    public void start(A trucks) {
        System.out.print(this.getName() + " на ");
        trucks.startMoving();
    }


    public void stop(A trucks) {
        System.out.print(this.getName() + " на ");
        trucks.finishMoving();
    }


    public void refill(A trucks) {
        System.out.print(this.getName() + " на ");
        trucks.pitStop();
    }

    public void getInTheCar(A trucks) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + trucks.getBrand() + " "
                + trucks.getModel() + " и будет участвовать в заезде.");
    }
}
