/*
 * Напишите программу для чтения предложения в списочный массив. Затем пе-
 * ретасуйте в массиве все слова, кроме первого и последнего, используя метод
 *
 * Collections. shuffle (), но не копируя слова в другую коллекцию.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pp11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = null;
        if (scanner.hasNext())
            str = scanner.nextLine();
        String[] subStr;
        if (str != null) {
            subStr = str.split(" ");
            Collections.addAll(arrayList, subStr);
            Collections.shuffle(arrayList.subList(1, arrayList.size() - 1));
            System.out.println(arrayList.toString());
        }
    }
}
