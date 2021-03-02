public class Car {
    private double distance;
    private final double consumption;
    private double fuelRemaining;

    public Car(double consumption) {
        this.consumption = consumption;
    }

    public void addFuelRemaining(double fuel) {
        this.fuelRemaining += fuel;
        System.out.println("Топливо залито!");
    }

    public boolean go(double howDistance) {
        if (howDistance < consumption * fuelRemaining) {
            distance += howDistance;
            fuelRemaining -= howDistance / consumption;
            return true;
        }
        else {
            System.out.println("Не хватает топлива на поездку!");
            return false;
        }
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelRemaining() {
        return fuelRemaining;
    }
}
