import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static <Integer> int randomElement(ArrayList<Integer> array) {
        return (int) array.get(new Random().nextInt(array.size()));
    }

    public static int randomElement(int[] array) {
        return (array[(new Random().nextInt(array.length))]);
    }
}
