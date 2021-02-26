/* Напишите программу, вводящую три целочисленных значения и выводящую
*  самое большое из них, используя только условную операцию. Сделайте то же
*  самое с помощью метода Math.max().
*/

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        int     max = Integer.MIN_VALUE;
        int     tmp;
        int     countNumber = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextInt()) {
                tmp = sc.nextInt();
                countNumber++;
                if (tmp > max) {
                    max = tmp;
                }
//                max = Math.max(tmp, max);
            }
            if (i == 2 && countNumber == 3) {
                System.out.println(max);
            }
        }
    }
}
