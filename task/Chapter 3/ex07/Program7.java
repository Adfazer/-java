/*
 * Реализуйте метод v o i d l u c k y S o r t ( A r r a y L i s t < S t r i n g > s t r i n g s , C o m p a r a t o r
 * < S t r i n g > com p), вызывающий метод C o l l e c t i o n s . s h u f f l e () для списочного
 *
 * массива до тех пор, пока элементы этого массива располагаются в возрастаю-
 * щем порядке, задаваемом компаратором.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("7");
        System.out.println(str.toString());
        luckySort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2) - Integer.parseInt(o1);
            }
        });
        System.out.println(str.toString());

    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i), strings.get(i + 1)) < 0) {
                return;
            }
        }
        Collections.shuffle(strings);
        luckySort(strings, comp);
    }
}
