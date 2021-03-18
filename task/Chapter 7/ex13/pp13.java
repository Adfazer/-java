/*
 * Всякий раз, когда в отображение типа LinkedHashMap вводится новый элемент,
 *
 * вызывается метод removeEldestEntry (). Реализуйте подкласс Cache, произво-
 * дный от класса LinkedHashMap и ограничивающий размер отображения задан-
 * ной величиной, предоставляемой в конструкторе этого класса.
 */

import java.util.Collections;
import java.util.Map;

public class pp13 {
    public static void main(String[] args) {
        Cache<String, Integer> cache = new Cache(11);
        cache.put("sdas", 11);
        System.out.println(cache.toString());
    }
}
