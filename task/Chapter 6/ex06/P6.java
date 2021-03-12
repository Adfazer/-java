/*
 * Реализуйте обобщенный метод, присоединяющий все элементы из одного
 * списочного массива к другому. Воспользуйтесь метасимволом подстановки для
 *
 * обозначения одного из аргументов типа. Предоставьте два равнозначных реше-
 * ния: одно с подстановочным типом ? e x t e n d s Е, другое — с подстановочным
 *
 * типом ? s u p e r Е.
 */

import java.util.ArrayList;
import java.util.Collections;

public class P6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
            list2.add(i+10);
        }

        System.out.println(addAll(list, list2).toString());
        System.out.println(addAll2(list, list2).toString());
    }

    public static <E> ArrayList<E> addAll2(ArrayList<? extends E> list, ArrayList<? extends E> list2) {
        ArrayList<E> newList = new ArrayList<>();
        newList.addAll(list);
        newList.addAll(list2);
        return newList;
    }

    public static <E> ArrayList<Object> addAll(ArrayList<? super  E> list, ArrayList<? super E> list2) {
        ArrayList<Object> newList = new ArrayList<>();
        newList.addAll(list);
        newList.addAll(list2);
        return newList;
    }
}
