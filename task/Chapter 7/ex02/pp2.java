/*
 * Сделайте все буквы прописными в символьных строках, содержащихся в мас-
 * сиве. С этой целью воспользуйтесь сначала итератором, затем перебором ин-
 * дексных значений в цикле и, наконец, методом replaceAll ().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Locale;

public class pp2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "SDDSADasdsadgfg", "LLLsd", "dsdFF");
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i).toLowerCase());
        }
        System.out.println(arrayList.toString());
        Collections.addAll(arrayList, "SDDSADasdsadgfg", "LLLsd", "dsdFF");
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next().toLowerCase());
        }
        System.out.println(arrayList.toString());
        Collections.addAll(arrayList, "SDDSADasdsadgfg", "LLLsd", "dsdFF");
        arrayList.replaceAll((x)->x.toLowerCase());
        System.out.println(arrayList.toString());
    }
}
