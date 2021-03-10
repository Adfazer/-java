/*
 * Реализуйте и испытайте средство форматирования протокольных записей, соз-
 * дающее HTML-файл.
 */

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Pr14 {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("task\\Chapter 5\\ex14\\javaLog.html");
        Logger.getGlobal().addHandler(fileHandler);
        Logger.getGlobal().info("dsdasdad");
    }
}
