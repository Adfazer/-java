/*
 * Определите разность во времени подсчета длинных слов с помощью методов
 * p a r a l l e l S t r e a m () и s t r e a m ( ) . Вызовите метод S y s t e m . c u r r e n t T i m e M i l l i s ()
 * до и после этих методов и выведите разность. Если у вас быстродействующий
 *
 * компьютер, выберите для подсчета длинных слов более длинный документ (на-
 * пример, роман "Война и мир").
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PPR2 {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("task/Chapter 8/ex02/alice.txt");
        String contents = Files.readString(pathToFile);

        List<String> words = Arrays.asList(contents.split(" "));

        long time1 = System.currentTimeMillis();
        long count = words.stream()
                .filter(w -> w.length() > 12)
                .count();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        
        long time3 = System.currentTimeMillis();
        long count2 = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);
           
        

        System.out.println(count);
    }
}
