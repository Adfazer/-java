import java.util.Arrays;

public interface IntSequance {
    static String of(int ... value) {
        return Arrays.toString(value);
    }
}
