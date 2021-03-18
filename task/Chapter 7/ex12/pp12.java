/*
 * Используя метод Collections . shuffle (), напишите программу для чтения
 * предложения, перетасовки его слов и вывода результата. Устраните (до и после
 * перетасовки) написание начального слова с заглавной буквы и наличие точки в
 * конце предложения. Подсказка: не перетасовывайте при этом слова.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pp12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = null;
        if (scanner.hasNext())
            str = scanner.nextLine();
        String[] subStr;
        if (str != null) {
            subStr = str.split(" ");
            for (int i = 0; i < subStr.length; i++) {
                if (i == 0)
                    subStr[0] = subStr[0].toLowerCase();
                if (i == subStr.length - 1)
                    subStr[subStr.length - 1] = subStr[subStr.length - 1].replaceAll("\\.", "");
                arrayList.add(subStr[i]);
            }
            Collections.shuffle(arrayList);
            System.out.println(arrayList.toString());
        }
    }
}
