/* Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной
*  величины n в переменной типа ArrayList<ArrayList<Integer».
*/

import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
        int n = 8;

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            lists.add(new ArrayList<>());
        }
        lists.get(0).add(1);
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    lists.get(i).add(1);
                }
                else {
                    lists.get(i).add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
        }
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
