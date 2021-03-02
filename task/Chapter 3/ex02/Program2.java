/*
 * Продолжите предыдущее упражнение, предоставив метод M e a s u r a b l e
 *
 * l a r g e s t (M e a s u r a b le [ ] o b j e c t s ) . Воспользуйтесь им, чтобы выяснить имя ра-
 * ботника с самой высокой зарплатой. Зачем требуется приведение типов?
 */

public class Program2 {
    public static void main(String[] args) {
        Measurable[] objects = new Measurable[10];

        for (int i = 0; i < 10; i++) {
            objects[i] = new Employee();
            System.out.println(objects[i].getMeasure());
        }
        System.out.println("----------");
        System.out.println(Employee.largest(objects).getMeasure());
    }
}
