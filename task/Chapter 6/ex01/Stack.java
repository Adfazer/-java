/*
 * Реализуйте обобщенный класс Stack<E>, управляющий списочным масси-
 * вом, состоящим из элементов типа Е. Предоставьте методы push(), рор()
 *
 * isEmpty().
 */

import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
