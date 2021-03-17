/*
 * Счетчик в отображении счетчиков можно обновить следующим образом:
 * counts.merge(word, 1, Integer::sum);
 *
 * Сделайте то же самое без метода merge (), воспользовавшись, во-первых, ме-
 * тодом contains (); во-вторых, методом get () и проверкой пустых значений
 *
 * (null); в-третьих, методом getOrDefault () и, в-четвертых, методом putlf
 * A b s e n t ().
 */


import java.util.HashMap;
import java.util.Map;

public class pp9 {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        String string = "word";
//        String string = null;


        counts.merge(string, 1, Integer::sum);

        if (counts.containsKey(string) == false)
            counts.put(string, 1);
        else
            counts.put(string, counts.get(string) + 1);

//        counts.putIfAbsent(string, 11);

        System.out.println(counts.toString());
    }
}
