/*
 * Еще раз реализуйте обобщенный класс Stack<E>, используя массив для хране-
 * ния элементов. Если требуется, нарастите массив в методе push (). Предоставь-
 * те два решения этой задачи: одно — с массивом типа Е [ ], другое — с массивом
 *
 * типа Object [ ]. Оба решения должны компилироваться без всяких предупреж-
 * дений. Какое из них вы предпочтете сами и почему?
 */


public class Stack2<E> {
    private E[] list;
    private int size = 10;
    private int count = 0;

    public Stack2() {
        list = (E[]) new Object[size];
    }

    public void push(E o) {
        if (count == size) {
            Object[] subList = new Object[(int) (size * 1.5)];
            size *= 1.5;
            for (int i = 0; i < count; i++) {
                subList[i] = list[i];
                list = (E[]) subList;
            }
        }
        list[count] = o;
        count++;
    }

    public E pop() {
        if (count != 0)
            return (E) list[count - 1];
        return null;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
