/*
 * В этой главе рекомендовалось пользоваться интерфейсами вместо конкретных
 * классов структур данных, например, интерфейсом Мар вместо класса ТгееМар.
 * К сожалению, подобная рекомендация не идет дальше этого. Почему нельзя,
 * например, воспользоваться интерфейсом Map<String, Set<Integer», чтобы
 * представить содержание документа? (Подсказка: как инициализировать его?)
 * Каким типом структуры данных можно вместо этого воспользоваться?
 */

import java.util.*;

public class pp6 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < 11; i++) {
            HashSet hashSet = new HashSet();
            hashSet.add(i);
            hashSet.add(new Random().nextInt(100));
            map.put(((Object)i).toString(), hashSet);
        }
        System.out.println(map.toString());
        // почему нельзя ?
    }
}
