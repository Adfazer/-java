/* Напишите программу, вводящую целочисленное значение и выводящу его
*  в двоичной, восьмиричной и шестнадцатиричной форме. Организуйте вывод
*  обратного значения в виде шестандцатеричного числа с плавающей точкой. ?????????
*/

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        int     number;
        float   invertNumber;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            System.out.println(Integer.toBinaryString(number));
            System.out.println(Integer.toOctalString(number));
            System.out.println(Integer.toHexString(number));
            invertNumber = 1.0f / number;
            System.out.println(Float.toHexString(invertNumber));
        }
    }
}
