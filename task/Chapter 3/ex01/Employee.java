import java.util.Random;

public class Employee implements Measurable {
    private double measure;

    public Employee() {
        measure = new Random().nextDouble() * 100_000;
    }

    @Override
    public double getMeasure() {
        return measure;
    }

    public static double average(Measurable[] objects) {
        double sum = 0;

        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }
}
