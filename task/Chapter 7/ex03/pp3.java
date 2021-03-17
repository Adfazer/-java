/*
 * Как вычислить объединение, пересечение и разность двух множеств, используя
 * только методы из интерфейса Set, но не организуя циклы?
 */

import java.util.HashSet;
import java.util.Set;

public class pp3 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hashSet1.add(i);
            hashSet2.add(i + 3);
        }
        System.out.println(hashSet1.toString());
        System.out.println(hashSet2.toString());
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union.toString());
        HashSet<Integer> crossing = new HashSet<>(hashSet1);
        crossing.retainAll(hashSet2);
        System.out.println(crossing.toString());
        HashSet<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println(difference.toString());
    }
}
