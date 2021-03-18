/*
 * Напишите метод для получения неизменяемого представления списка чисел
 * от 0 до п, не сохраняя эти числа.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pp14 {
    public static void main(String[] args) {

    }

    public static List<Integer> unmodArrayNumbers(int n) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i, i);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
