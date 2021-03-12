/*
 * Реализуйте следующий метод, сохраняющий наименьший и наибольший эле-
 * менты из массива e le m e n t s в списке r e s u l t :
 *
 * public static <Т> void minmax(List<T> elements,
 * Comparator<? super T> comp, List<? super T> result)
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class P12 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Random().nextInt(100));
            System.out.println(arrayList.get(i));
        }
        List<Integer> result = new ArrayList<>();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        minmax(arrayList, comparator, result);
        System.out.println("_________");
        System.out.println(result.toString());
    }

    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        T max = elements.stream().max(comp).get();
        T min = elements.stream().min(comp).get();
        result.add(min);
        result.add(max);
    }
}
