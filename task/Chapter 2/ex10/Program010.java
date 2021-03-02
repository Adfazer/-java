/*
 * Предоставьте в классе R a n d o m N u m b e rs два статических метода типа ra n d o m
 * E le m e n t, получающих произвольный элемент из обычного или списочного
 * массива целочисленных значений. (Если обычный или списочный массив пуст,
 * должен быть возвращен нуль.) Почему эти методы нельзя сделать методами
 * экземпляра типа t [ ] или A r r a y L i s t < I n t e g e r > ?
 */

import java.util.ArrayList;

public class Program010 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        System.out.println(RandomNumbers.randomElement(arrayList));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(RandomNumbers.randomElement(array));
    }
}
