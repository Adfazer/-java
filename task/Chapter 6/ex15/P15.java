/*
 * Реализуйте метод ш ар () , получающий списочный массив и объект типа
 * F u n c t io r K T , R> (см. главу 3) и возвращающий списочный массив, состоящий
 * из результатов применения функции к заданным элементам этого массива.
 */

import java.util.ArrayList;
import java.util.function.Function;

public class P15 {
    public static void main(String[] args) {

    }

    public static <R, T> ArrayList<R> map(ArrayList<T> list, Function<T, R> function) {
        ArrayList<R> arrayLists = new ArrayList<>();
        for (T t : list) {
            arrayLists.add(function.apply(t));
        }
        return arrayLists;
    }
}
