/*
 * Напишите программу, вызывающую метод из предыдущего упражнения и
 *
 * выводящую полученный результат. Организуйте перехват исключений и пре-
 * доставьте ответную реакцию на действия пользователя в виде сообщений о лю-
 * бых ошибочных условиях.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Pr3 {
    public static void main(String[] args) throws IOException {
        System.out.println(sumOfValues("C:\\Users\\Skaren\\Desktop\\21\\task\\task\\Chapter 5\\ex01\\test"));
    }

    public static double sumOfValues(String filename) throws IOException {
        double sum = 0;
        ArrayList<Double> arrayList = readValues(filename);
        for (Double aDouble : arrayList) {
            sum += aDouble;
        }
        return sum;
    }

    public static ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> arrayList = new ArrayList<>();
        byte[] buff;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(filename);
            buff = new byte[fileInputStream.available()];
            fileInputStream.read(buff, 0, buff.length);
        } catch (IOException e) {
            System.out.println("не удается открыть файл");
            throw e;
        }
        char[] chars = new char[buff.length];
        for (int i = 0; i < buff.length; i++) {
            chars[i] = (char) buff[i];
        }
        String string = Arrays.toString(chars);
        string = string.replaceAll(", " ,"");
        string = string.replaceAll("\\[", "");
        string = string.replaceAll("]", "");
        String[] subst;
        subst = string.split(" ");
        for (String s : subst) {
            try {
                arrayList.add(Double.parseDouble(s));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка формата числа в парсере");
                throw e;
            }
        }
        return arrayList;
    }
}
