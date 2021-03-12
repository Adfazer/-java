/*
 * Реализуйте обобщенный класс Table<K, V>, управляющий списочным мас-
 * сивом, состоящим из элементов типа Entry<K, V>. Предоставьте методы для
 *
 * получения значения, связанного с ключом, установки значения по заданному
 * ключу и удаления ключа.
 */

import java.util.ArrayList;
import java.util.Map;

public class Table<K, V> {
    ArrayList<Map.Entry<K, V>> list = new ArrayList<>();

    public V getValue(K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey() == key) {
                return list.get(i).getValue();
            }
        }
        return null;
    }

    public void setValueFromKey(K key, V value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey() == key) {
                list.get(i).setValue(value);
                return;
            }
        }
    }

    public void deleteKey(K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey() == key) {
                list.remove(i);
                return;
            }
        }
    }
}
