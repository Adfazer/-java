/* Напишите программу, вводящую целочисленное (как положительное, так и
*  отрицательное) значение угла и нормализующую его в пределах от 0 до 359
*  градусов. Попробуйте сделать это сначала с помощью операции %, а затем ме-
*  тода floorMod(). ????????
*/

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        int     angle;

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            angle = sc.nextInt();
            if (angle < 0) {
                angle += 360 * Math.ceil(angle * -1.0f / 360);
            }
            if (angle >= 360) {
                angle %= 360;
            }
//            if (angle >= 360) {
//                angle = Math.floorMod(angle, 360);
//            }
            System.out.println(angle);
        }
    }
}
