/*
 * Предоставьте в служебном классе A r r a y s следующий метод, возвращающий
 *
 * пару, состоящую из первого и последнего элементов массива а, указав подхо-
 * дящий аргумент типа:
 *
 * public static <Е> Pair<E> firstLast(ArrayList<__ > a) ??????????????
 */

import java.util.ArrayList;

public class P9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }

        Pair<Integer> pair = firstLast(arrayList);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

    public static <E> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }
}
