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

    public static Measurable largest(Measurable[] objects) {
        double max = Double.MIN_VALUE;
        Measurable tmp = null;
        for (int i = 0; i < objects.length; i++) {
            if (max < objects[i].getMeasure()) {
                max = objects[i].getMeasure();
                tmp = objects[i];
            }
        }
        return tmp;
    }
}
