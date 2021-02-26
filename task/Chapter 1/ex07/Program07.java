/* Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраня-
*  ющую их в переменных типа short и вычисляющую их сумму, разность, про-
*  изведение, частное и остаток без знака, не преобразуя эти величины в тип int. ???????????
*/

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        short number[] = new short[3];
        int   tmp;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            if (sc.hasNextInt()) {
                tmp = sc.nextInt();
                if (tmp >= 0 && tmp <= 65535) {
                    number[i] = (short)tmp;
                }
                else {
                    break;
                }
            }
            if (i == 1) {
                number[2] = (short) (number[0] + number[1]);
                System.out.println(number[2]);
                number[2] = (short) (number[0] - number[1]);
                System.out.println(number[2]);
                number[2] = (short) (number[0] * number[1]);
                System.out.println(number[2]);
                number[2] = (short) (number[0] / number[1]);
                System.out.println(number[2]);
                number[2] = (short) (number[0] % number[1]);
                System.out.println(number[2]);
            }
        }
    }
}
