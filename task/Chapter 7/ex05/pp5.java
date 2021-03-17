/*
 * Реализуйте метод public static void swap(List<?> list, int i, int j), вы-
 * полняющий перестановку элементов обычным образом, когда класс, опре-
 * деляющий тип параметра list, реализует интерфейс RandomAccess, а иначе
 *
 * сводящий к минимуму обход элементов на позициях, обозначаемых индек-
 * сами i и j.
 */

import java.util.*;

public class pp5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        swap(list, 1, 2);
        System.out.println(list.toString());
    }

    public static <T> void swap(List<T> list, int i, int j) {
        if (i == j)
            return;
        if (list instanceof RandomAccess) {
            Object o = list.get(i);
            list.set(i, list.<T>get(j));
            list.set(j, (T) o);
        }
        else {
            ListIterator listIterator = list.listIterator();
            Object o1 = null;
            Object o2 = null;
            while (listIterator.hasNext()) {
                if (listIterator.previousIndex() + 1 == i)
                    o1 = listIterator.next();
                else if (listIterator.previousIndex() + 1 == j)
                    o2 = listIterator.next();
                else
                    listIterator.next();
                if (o1 != null & o2 != null)
                    break;
            }
            int[] exitFlag = {0, 0};
            listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.previousIndex() == i) {
                    listIterator.set(o2);
                    exitFlag[0] = 1;
                }
                else if (listIterator.previousIndex() == j) {
                    listIterator.set(o1);
                    exitFlag[1] = 1;
                }
                if (exitFlag[0] == 1 & exitFlag[1] == 1)
                    break;
                listIterator.next();
            }
        }
    }
}
