/*
 * Предоставьте интерфейс M e a s u r a b le с методом d o u b le g e t M e a s u r e (), изме-
 * ряющим объект определенным образом. Создайте класс Em p lo ye e , реализую-
 * щий интерфейс M e a s u r a b le . Предоставьте метод d o u b le a v e r a g e (M e a su ra b le [ ]
 *
 * o b j e c t s ) , вычисляющий среднюю меру. Воспользуйтесь им для расчета сред-
 * ней зарплаты в массиве работников.
 */

public class Program11111 {
    public static void main(String[] args) {
        Measurable[] objects = new Measurable[10];

        for (int i = 0; i < 10; i++) {
            objects[i] = new Employee();
            System.out.println(objects[i].getMeasure());
        }
        System.out.println("----------");
        System.out.println(Employee.average(objects));
    }
}
