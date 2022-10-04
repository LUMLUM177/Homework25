public class Main {
    public static void main(String[] args) {

        Auto audi = new Auto("Audi", "A8", 2.7);
        Auto hyundai = new Auto("Hyundai", "Ferrato", 2.3);
        Auto lada = new Auto("Lada", "Grande", 1.6);
        Auto ford = new Auto("Ford", "Focus", -5.0);

        Trucks kamaz = new Trucks("Камаз", "А 30", 18.0);
        Trucks sable = new Trucks("Соболь", "М 333", 11.0);
        Trucks gazelle = new Trucks("Газель", "Г 3", 9.0);
        Trucks zil = new Trucks("ЗИЛ", "З 100", 17.0);

        Bus lion = new Bus("Lion", "City", 10);
        Bus city = new Bus("СитиРитм", "10", 9);
        Bus cursor = new Bus("ЛиАЗ", "4292", 8);
        Bus mercedez = new Bus("Mercedez-Benz", "Sprinter II", 7);

        System.out.println();
        System.out.println(lada);
        System.out.println(kamaz);
        System.out.println(lion);

        System.out.println();
        cursor.getMaxSpeed();
        sable.getBestTimeLap();
        audi.pitStop();
        System.out.println();

        DriverB<Auto> john = new DriverB<>("John", true, 5);
        john.getInTheCar(hyundai);
        DriverC<Trucks> philipp = new DriverC<>("Philipp", false, 7);
        philipp.getInTheCar(gazelle);
        DriverD<Bus> elza = new DriverD<>("Elza", true, 10);
        elza.getInTheCar(mercedez);

        System.out.println();
        john.start(hyundai);
        john.stop(hyundai);
        john.refill(hyundai);

        System.out.println();
        philipp.start(gazelle);
        philipp.stop(gazelle);
        philipp.refill(gazelle);

        System.out.println();
        elza.start(mercedez);
        elza.stop(mercedez);
        elza.refill(mercedez);

    }
}
