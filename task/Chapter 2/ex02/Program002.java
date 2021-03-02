import java.util.Random;
import java.util.Scanner;

/*
 * Проанализируйте метод n e x t l n t () из класса S c a n n e r. Является ли он методом
 * доступа или модифицирующим методом и почему? А что можно сказать о
 * методе n e x t l n t () из класса Random?
 */

public class Program002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
        sc.nextInt(); // метод доступа
        Random random = new Random();
        random.nextInt(); // ???
    }
}
