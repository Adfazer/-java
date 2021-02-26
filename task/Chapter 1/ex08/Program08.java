/* Напишите программу, вводящую символьную строку и выводящую все ее не-
*  пустые подстроки. ????????????
*/

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        String string;
        String[] subString;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            string = sc.nextLine();
            subString = string.split(" ");
            for (int i = 0; i < subString.length; i++) {
                System.out.println(subString[i]);
            }
        }

    }
}
