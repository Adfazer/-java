/*
 * Продолжая предыдущее упражнение, предоставьте метод m in M ax (), возвраща-
 * ющий объект типа P a i r с наименьшим и наибольшим элементами массива. ??????????????????//
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class P11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Random().nextInt(100));
            System.out.println(arrayList.get(i));
        }

        Pair<Integer> pair = minMax(arrayList);
        System.out.println("_________________");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
    
    public static <E> Pair<E> minMax(ArrayList<E> arrayList) {
        return new Pair<>(arrayList.stream().max(new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                Class<?> returnType = o1.getClass();
                return P11.compare(returnType, o2, o1) > 0 ? -1: 0;
            }
        }).get(), arrayList.stream().min(new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                Class<?> returnType = o1.getClass();
                return P11.compare(returnType, o2, o1) > 0 ? 0: 1;
            }
        }).get());
    }

    private static int compare(Class<?> returnType,Object a, Object b) {
        if(returnType == String.class) {
            return ((String)a).compareTo((String)b);
        } else if(returnType == Short.class) {
            return ((Short)a).compareTo((Short)b);
        } else if(returnType == Integer.class) {
            return ((Integer)a).compareTo((Integer)b);
        } else if(returnType == Long.class) {
            return ((Long)a).compareTo((Long)b);
        } else if(returnType == Float.class) {
            return ((Float)a).compareTo((Float)b);
        } else if(returnType == Double.class) {
            return ((Double)a).compareTo((Double)b);
        }
        return 0;
    }
}
