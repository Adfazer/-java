/*
 * Рассмотрите следующий вариант метода swap (), где массив может быть предо-
 * ставлен с помощью ар1ументов переменной длины:
 *
 * public static <Т> Т[] swap(int i, int j, T... values) {
 * T temp = values[i];
 *
 * values[i] = values [j];
 * values[j] = temp;
 * return values;
 * А теперь рассмотрите следующий вызов:
 * Doublet] result = Arrays.swap(0, 1, 1.5, 2, 3);
 * Какое сообщение об ошибке вы получите? Далее сделайте такой вызов:
 * Doublet] result = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
 * Изменилось ли к лучшему сообщение об ошибке? Что нужно сделать для
 * устранения ошибки?
 */

import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
//        Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
//        Double[] result = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
//        Double[] result = (Double[]) swap(0, 1, 1.5, 2, 3);
    }

    public static <T> T[] swap(int i, int j, T ... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}
