/*
 * Во врезке "Внимание!" из раздела 6.6.7 упоминается вспомогательный ме-
 * тод t h ro w A s (), применяемый для "приведения" типа исключения ех к типу
 *
 * R u n t im e E x c e p t io n и его генерирования. Почему для этой цели нельзя восполь-
 * зоваться обычным приведением типов, т.е. th ro w ( R u n t im e E x c e p t io n ) e x ?
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class Exceptions {
    @SuppressWarnings("unchecked")
    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw (T) e; // Приведение обобщенного типа стирается в тип (Throwable) е
    }
    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            Exceptions.<RuntimeException>throwAs(ex);  // Reference parameters are not allowed here - ссылочные параметры сдесь не допускаются
            return null;
        }
    }

    public static String readAll(Path path) {
        return doWork(() -> new String(Files.readAllBytes(path)));
    }
}
