/*
 * Убедитесь, что запрос первых пяти длинных слов не требует вызова метода
 *
 * f i l t e r (), если найдено пятое длинное слово. С этой целью просто организуй-
 * те протоколирование вызова каждого метода.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class PPR1 {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("task/Chapter 8/ex01/alice.txt");
        String contents = Files.readString(pathToFile);

        List<String> words = Arrays.asList(contents.split(" "));

        long count = words.stream()
                .filter(w -> {
                    Logger.getGlobal().info("finde" + w);
                    return  w.length() > 12;
                })
                .limit(5)
                .count();

//        int count = 0;
//        for (String w : words) {
//            if (count < 5 && w.length() > 12) count++;
//            Logger.getGlobal().info("finde" + w);
//        }
        System.out.println(count);
    }
}
