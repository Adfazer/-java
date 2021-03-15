/*
 * Реализуйте следующий метод:
 * 0SafeVarargs public static final <T> T[] repeat(int n, T... objs)
 * Он должен возвращать массив n копий заданных объектов. Имейте в виду, что
 *
 * для этого не потребуется объект типа C l a s s или ссылка на конструктор, по-
 * скольку наращивать количество объектов o b j s можно рефлексивно.
 */

public class P20 {
    public static void main(String[] args) {

    }

    @SafeVarargs public static final <T> T[] repeat(int n, T ... objs) {
        T[] result;
        if (objs.length >= n)
            result = objs;
        else {
            @SuppressWarnings("unchecked") T[] newArray =(T[]) java.lang.reflect.Array.newInstance(objs.getClass().getComponentType(), n);
            result = newArray;
        }
        for (int i = 0; i < n; i++) {
            result[i] = objs[i];
        }
        return result;
    }
}
