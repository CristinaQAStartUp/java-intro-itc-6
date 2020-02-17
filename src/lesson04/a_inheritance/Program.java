package lesson04.a_inheritance;

public class Program {
    public static void main(String[] args) {
        Truck truck = new Truck("Renault", 2005);
        PassangerCar car = new PassangerCar("Daewoo", 2020);

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        car.gas();
        truck.stop();
        car.stop();
    }
}
