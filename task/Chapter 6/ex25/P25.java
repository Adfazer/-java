/*
 * Напишите метод p u b lic s t a t ic S t r in g g e n e ric D e c la ra tio n (Method m), возвра-
 * щающий объявление метода m(), перечисляющего параметры типа с их огра-
 * ничениями и типами параметров метода, включая их аргументы типа, если
 *
 * это обобщенные типы.
 */

import java.lang.reflect.Method;

public class P25 {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(genericDeclaration(P25.class.getMethod("m", int.class, String.class, Object[].class)));
    }

    public static String genericDeclaration(Method m) {
        return m.toGenericString();
    }

    public static <T> int m(int f, String str, T[] ts) {
        double a = 9.0;
        double c = 11.0;
        a = c + a;
        return (int) a;
    }
}
