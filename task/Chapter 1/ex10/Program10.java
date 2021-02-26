/* Напишите программу, составляющую произвольную символьную строку из
*  букв и цифр, генерируя произвольное значение типа long и выводя его по ос-
*  нованию 36.
*/

import java.util.Random;

public class Program10 {
    public static void main(String[] args) {
        long number;
        Random random = new Random();
        final String base = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder numberToBase = new StringBuilder();
        int negative = 1;

//        number = 739172;
        number = random.nextLong();
        System.out.println(number);
        if (number < 0) {
            negative = -1;
            number *= -1;
        }

        int count_str = 1;
        long tmpNumber = number;
        while (tmpNumber >= 36)
        {
            tmpNumber = tmpNumber / 36;
            count_str++;
        }

        while (count_str != 0)
        {
            numberToBase.insert(0, base.charAt((int) (number % 36)));
            number = number / 36;
            count_str--;
        }
        if (negative == -1) {
            numberToBase.insert(0, "-");
        }
        System.out.println(numberToBase);
    }
}
