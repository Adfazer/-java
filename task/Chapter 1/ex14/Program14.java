/* Напишите программу, вводящую двумерный массив целочисленных значений
*  и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая
*  сумма значений во всех строках, столбцах и диагоналях). Принимая строки
*  вводимых данных, разбивайте их на отдельные целочисленные значения, пре-
*  кратив этот процесс, когда пользователь введет пустую строку. Например, на
*  следующие вводимые данные:
*  16 3 2 13
*  3 10 11 8
*  9 6 7 12
*  4 15 14 1
*  (Пустая строка)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();;
        String string;
        String[] strArr;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            string = sc.nextLine();
            if (string.equals(""))
                break;
            strArr = string.split(" ");
            lists.add(new ArrayList<>());
            for (int j = 0; j < strArr.length; j++) {
                lists.get(i).add(Integer.parseInt(strArr[j]));
            }
            i++;
        }
        int size = lists.size();
        for (int j = 0; j < lists.size(); j++) {
            if (lists.get(j).size() != size) {
                System.out.println("Матрица не квадрат");
                return;
            }
        }

        int sumVert = 0;
        int sumHorizon = 0;
        int sumLeftDia = 0;
        int sumRightDia = 0;

        for (int j = 0; j < lists.get(0).size(); j++) {
            sumHorizon += lists.get(0).get(j);
        }
        for (int j = 0; j < lists.size(); j++) {
            sumVert += lists.get(j).get(0);
        }
        for (int j = 0; j < lists.size(); j++) {
            sumLeftDia += lists.get(j).get(j);
        }
        for (int j = 0; j < lists.size(); j++) {
            sumRightDia += lists.get(j).get(j);
        }

        for (int j = 1; j < lists.size(); j++) {
            int tmpSum = 0;
            for (int k = 0; k < lists.size(); k++) {
                tmpSum += lists.get(j).get(k);
            }
            if (tmpSum != sumHorizon) {
                System.out.println("квадрат не магический");
                return;
            }
        }

        for (int j = 1; j < lists.size(); j++) {
            int tmpSum = 0;
            for (int k = 0; k < lists.size(); k++) {
                tmpSum += lists.get(k).get(j);
            }
            if (tmpSum != sumVert) {
                System.out.println("квадрат не магический");
                return;
            }
        }
        if (sumVert == sumHorizon && sumVert == sumLeftDia && sumVert == sumRightDia) {
            System.out.println("квадрат магический");
        }
        else {
            System.out.println("квадрат не магический");
        }
    }
}
