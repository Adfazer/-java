/*
 * В разделе 5.1.6 приведен пример ошибочного внедрения блока операторов
 *
 * c a t c h и f i n a l l y в блок кода оператора t r y . Исправьте этот код, во-первых, пе-
 * рехватив исключение в операторе f i n a l l y , во-вторых, внедрив блок операто-
 * ров t r y / f i n a l l y в блок операторов t ry / c a t c h , и в-третьих, применив оператор
 *
 * t r y с ресурсами вместе с оператором c a tc h .
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pr6 {
    public static void main(String[] args) {
        try (BufferedReader in = Files.newBufferedReader(Path.of("C:\\Users\\Skaren\\ttt"), StandardCharsets.UTF_8)) {
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
//        BufferedReader in = null;
//        try {
//            in = Files.newBufferedReader(Path.of("C:\\Users\\Skaren\\Desktop\\21\\task\\task\\Chapter 4\\ex10\\text"), StandardCharsets.UTF_8);
//        } catch (IOException ex) {
//            System.err.println("Caught IOException: " + ex.getMessage());
//        } finally {
//            if (in != null) {
//                in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение!
//            }
//        }
    }
}
