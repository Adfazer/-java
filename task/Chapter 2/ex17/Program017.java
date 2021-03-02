/*
 * Предоставьте итератор — объект, извлекающий по порядку элементы очере-
 * ди из предыдущего упражнения. Сделайте класс Iterator вложенным и опре-
 * делите в нем методы next () и hasNext (). Определите в классе Queue метод
 *
 * iterator (), возвращающий ссылку на объект Queue .Iterator. Должен ли вну-
 * тренний класс Iterator быть статическим?
 */


public class Program017 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        while (queue.iterator().hasNext()) {
            System.out.println(queue.iterator().next());
        }
    }
}
