/*
 * Реализуйте алгоритм под названием "Решето Эратосфена" для выявления всех
 *
 * простых чисел меньше или равных п. Сначала введите все числа от 2 до п в мно-
 * жество. Затем организуйте повторяющийся поиск наименьшего элемента s
 *
 * этом множестве, постепенно удаляя из него элементы s 2, s • ( s + 1), s • ( s + 2)
 * и т.д. Этот поиск завершается при условии, когда s 2 > п. Реализуйте данный
 * алгоритм как для множества типа HashSet<Integer>, так и для множества типа
 * BitSet.
 */

import java.util.BitSet;
import java.util.HashSet;

public class pp1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = 30;
        for (int i = 2; i <= n; i++) {
            hashSet.add(i);
        }
        for (int i = 3; i < n; i++) {
            if (i % 2 == 0)
                hashSet.remove(i);
        }
        for (int i = 3; i * i < n; i += 2) {
            for (int j = i * 2; j <= n; j++) {
                if (j % i == 0) {
                    hashSet.remove(j);
                }
            }
        }
        System.out.println(hashSet.toString());

        BitSet bitSet = new BitSet(n);
        for (int i = 2; i <= n; i++) {
            bitSet.set(i);
        }
        for (int i = 3; i < n; i++) {
            if (i % 2 == 0)
                bitSet.clear(i);
        }
        for (int i = 3; i * i < n; i += 2) {
            for (int j = i * 2; j <= n; j++) {
                if (j % i == 0)
                    bitSet.clear(j);
            }
        }
        System.out.println(bitSet.toString());
    }
}
