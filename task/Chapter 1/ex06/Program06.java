/* Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х п, исполь-
*  зуя класс Biglnteger. Вычислите факториал числа 1000.
*/

import java.math.BigInteger;

public class Program06 {
    public static void main(String[] args) {
        int factorial = 1000;

        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = 1; i < factorial + 1; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            bigInteger = bigInteger.multiply(bigI);
        }
        System.out.println(bigInteger.toString());
    }
}
