/*
 * К чему приведет стирание типов в приведенных ниже методах из класса
 * C o l l e c t i o n ?
 * public static <Т extends Comparable<? super Т »
 * void sort(List<T> list)
 * public static <T extends Object & Comparable<? super Т »
 * T max (Collections extends T> coll)
 */

import java.util.Collection;
import java.util.List;

public class P16 {
    public static void main(String[] args) {

    }


    public static <T extends Comparable<? super T >> void sort(List<T> list) {}
//    public static <T extends Object & Comparable<? super T>> void max(Collection<> coll) {}
}
