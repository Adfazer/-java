/*
 * Напишите программу, выводящую сообщение " H e l l o , W o r ld ", воспользовав-
 * шись рефлексией для поиска поля o u t в классе j a v a . l a n g . S y s t e m и методом
 *
 * in v o k e ( ) для вызова метода p r i n t l n ().
 */

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Prog11 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class ac = System.out.getClass();
        Method am = ac.getMethod("println", String.class);
        am.setAccessible(true);
        am.invoke(am, "suds");
    }
}
