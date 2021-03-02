/*
 * Реализуйте в классе Queue неограниченную очередь символьных строк. Пре-
 * доставьте метод add () для ввода элемента в хвост очереди и метод remove ()
 *
 * для удаления элемента из головы очереди. Организуйте хранение элементов
 * в виде связного списка узлов, создав вложенный класс Node. Должен ли этот
 * класс быть статическим?
 */

public class Program016 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.display();
        queue.remove();
        queue.display();
    }
}
