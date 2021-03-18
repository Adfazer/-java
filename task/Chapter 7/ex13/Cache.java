/*
 * Всякий раз, когда в отображение типа LinkedHashMap вводится новый элемент,
 *
 * вызывается метод removeEldestEntry (). Реализуйте подкласс Cache, произво-
 * дный от класса LinkedHashMap и ограничивающий размер отображения задан-
 * ной величиной, предоставляемой в конструкторе этого класса.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> extends LinkedHashMap<K, V> {
    private final int maxEntries;

    public Cache(final int maxEntries) {
        super(maxEntries + 1, 1.0f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size() > maxEntries;
    }
}
