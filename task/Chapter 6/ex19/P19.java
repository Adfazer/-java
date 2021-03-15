/*
 * Рассмотрите следующий метод, представленный в разделе 6.6.3:
 * public static <Т> ArrayList<T> repeat(int n, T obj)
 * Этот метод без особых хлопот составляет списочный массив типа A r r a y L is t < T >
 * из элементов обобщенного типа Т. Можно ли получить массив типа Т [ ] из
 * этого списочного массива, не пользуясь объектом типа C l a s s или ссылкой на
 * конструктор? Если нельзя, то почему?
 */

import java.util.ArrayList;

public class P19 {
    public static void main(String[] args) {
        System.out.println(repeat2(10, 42).toArray().getClass());
    }

    public static <T> ArrayList<T> repeat2(int n, T obj) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
