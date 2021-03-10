/*
 * Напишите рекурсивный метод f a c t o r i a l (), выводящий все кадры стека перед
 *
 * возвратом значения. Постройте (но не генерируйте) объект исключения любо-
 * го типа и получите результат трассировки его стека, как пояснялось в разде-
 * ле 5.1.8. ?????????????
 */

public class Pr10 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        ClassNotFoundException classNotFoundException = new ClassNotFoundException();
        classNotFoundException.printStackTrace();
        if (number > 1) {
            return number * factorial(number - 1);
        }
        return 1;
    }
}
