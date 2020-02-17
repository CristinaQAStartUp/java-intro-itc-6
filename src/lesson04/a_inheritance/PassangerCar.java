package lesson04.a_inheritance;

public class PassangerCar extends Vehicle {
    public PassangerCar(String model, int produceYear) {
        super(model, produceYear);
    }

    @Override
    public String toString() {
        return "PassangerCar{} extends " + super.toString();
    }
}
