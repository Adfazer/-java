/*
 * Реализуйте метод, содержащий код, где применяются классы S c a n n e r и P r i n t
 * W r i t e r (см. раздел 5.1.5). Но вместо оператора t r y с ресурсами воспользуйтесь
 * оператором c a tc h . Непременно закройте оба объекта, при условии, что они
 *
 * построены надлежащим образом. Для этого вам придется принять во внима-
 * ние следующие условия.
 *
 * • Конструктор класса Scanner генерирует исключение.
 * • Конструктор класса PrintWriter генерирует исключение.
 * • Метод h a s N e x t (), n e x t () или p r i n t l n () генерирует исключение.
 * • Метод o u t . c l o s e () генерирует исключение.
 * • Метод i n . c l o s e () генерирует исключение. ???????????
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try {
            Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
            PrintWriter out = new PrintWriter("output.txt");
            while (in.hasNext())
                out.println(in.next().toLowerCase());
            in.close();
            out.close();
        } catch (IOException e) {
//            Throwable[] secondaryExceptions = e.getSuppressed();
//            for (Throwable secondaryException : secondaryExceptions) {
//                e.addSuppressed(secondaryException);
//            }
        }
    }
}
