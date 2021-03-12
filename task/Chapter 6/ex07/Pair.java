/*
 * 7. Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элемен-
 * тов типа Е. Предоставьте методы доступа для получения первого и второго эле-
 * ментов.
 * 8. Видоизмените класс из предыдущего упражнения, введя методы шах () и m in ()
 *
 * для получения наибольшего и наименьшего из двух элементов. Наложите со-
 * ответствующее ограничение на обобщенный тип Е.
 */


public class Pair<E> {
    private final E first;
    private final E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getSecond() {
        return second;
    }

    public E getFirst() {
        return first;
    }

    public E max() {
        Class<?> returnType = first.getClass();
        return compare(returnType, first, second) > 0 ? first: second;
    }

    public E min() {
        Class<?> returnType = first.getClass();
        return compare(returnType, first, second) > 0 ? second: first;
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
