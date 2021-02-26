/* Напишите программу, выбирающую и выводящую лотерейную комбинацию
*  из шести отдельных чисел в пределах от 1 до 49. Чтобы выбрать шесть отдель-
*  ных чисел, начните со списочного массива, заполняемого числами от 1 до 49.
*  Выберите произвольный индекс и удалите элемент массива. Повторите эти
*  действия шесть раз подряд. Выведите полученный результат в отсортирован-
*  ном порядке. ????????????
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            list.add(i);
        }
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.remove(random.nextInt(list.size()));
        }
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
