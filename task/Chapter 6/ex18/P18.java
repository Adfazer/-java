/*
 * Рассмотрите следующий метод, представленный в разделе 6.6.3:
 * public static <Т> Т[] repeat(int n, Т obj, IntFunction<T[]> constr)
 *
 * Почему исход вызова A r r a y s . r e p e a t ( 10, 42, i n t [ ] : :new ) окажется неудач-
 * ным? Как устранить этот недостаток? Что нужно сделать для применения дру-
 * гих примитивных типов?
 */

import java.util.ArrayList;

public class P18 {
    public static void main(String[] args) {
//        int[] array =  repeat(10, 42, int[] :: new);
        ArrayList<Integer> arrayList = repeat2(10, 42);
    }

    public static <T> ArrayList<T> repeat2(int n, T obj) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static <T> T[] repeat(int n, T obj, Class<T> cl) {
        @SuppressWarnings("unchecked") T[] result =
                (T[]) java.lang.reflect.Array.newInstance(cl, n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }
}
