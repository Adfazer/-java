/*
 * Воспроизведите ситуацию, когда возникает исключение типа Concur г entModif
 * icationException. Что можно предпринять, чтобы избежать этого?
 */

// использовать ListIterator, не делать модификацию во время работы итератора

import java.util.HashSet;
import java.util.Iterator;

public class pp4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hashSet.add(i);
        }

        Iterator<Integer> iterator = hashSet.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            iterator.next();
            hashSet.remove(i++);
        }
    }
}
