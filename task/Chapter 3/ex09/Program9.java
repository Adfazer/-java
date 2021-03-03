/*
 * Реализуйте следующие методы:
 * public static void runTogether(Runnable... tasks)
 * public static void runlnOrder(Runnable... tasks)
 *
 * Первый метод должен выполнять каждую задачу в отдельном потоке и возвра-
 * щать полученный результат, а второй метод — все методы в текущем потоке и
 *
 * возвращать полученный результат по завершении последнего метода.
 */

public class Program9 {
    public static void main(String[] args) {
        Runnable[] runnables = new Greeter[5];
        for (int i = 0; i < 5; i++) {
            runnables[i] = new Greeter(((Object)i).toString());
        }
        runInOrder(runnables);
        System.out.println("---------");
        runTogether(runnables);
    }

    public static void runTogether(Runnable ... tasks) {
        for (int i = 0; i < tasks.length; i++) {
            Thread thread = new Thread(tasks[i]);
            thread.start();
        }
    }

    public static void runInOrder(Runnable ... tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].run();
        }
    }
}
