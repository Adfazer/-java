/*
 * Предоставьте в служебном классе A r r a y s обобщенные методы m in ( ) и шах(),
 * возвращающие наименьший и наибольший элементы массива соответственно.
 * ??????????????/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 22; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).get());

        System.out.println(arrayList.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).get());
    }
}
