/* Напишите программу, вводящую текстовую строку и выводящую все символы,
*  не представленные в коде ASCII, вместе с их значениями в Юникоде.
*/


public class Program11 {
    public static void main(String[] args) {
        String string;

        string = "Пример: عربى qweerrrtryfdgf";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 128) {
                System.out.print(string.charAt(i));
                System.out.print("(" + (int)string.charAt(i) + ")");
            }
        }
        System.out.println();
    }
}
