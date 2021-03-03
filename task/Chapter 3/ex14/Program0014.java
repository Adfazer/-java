/*
 * Организуйте вызов метода A r r a y s . s o r t (), сортирующего работников сна-
 * чала по зарплате, а затем по имени. Воспользуйтесь для этой цели методом
 *
 * C o m p a r a t o r. t h e n C o m p a r in g (). Затем организуйте сортировку в обратном по-
 * рядке.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program0014 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("name " + new Random().nextInt(100), new Random().nextDouble() * 100_000);
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getMeasure());
        }
        System.out.println();
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)o1.getMeasure() - (int)o2.getMeasure();
            }
        });
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getMeasure());
        }
        System.out.println();
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)o2.getMeasure() - (int)o1.getMeasure();
            }
        });
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getMeasure());
        }

        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
        System.out.println();
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
}
