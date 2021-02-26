/* В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
*  при вызове метода s . equals (t), но не с помощью операции s != t. Придумай-
*  те другой пример, в котором не применяется метод substring (). ?????????????
*/

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        String[] string = new String[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            if (sc.hasNextLine()) {
                string[i] = sc.nextLine().intern();
            }
            if (i == 1) {
                if (string[0] == string[1]) {
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }

        }

    }
}
