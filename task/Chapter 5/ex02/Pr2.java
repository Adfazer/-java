/*
 * Напишите метод p u b l i c d o u b le s u m O fV a lu e s ( S t r i n g f ile n a m e ) t h ro w s . . ., вы-
 * зывающий метод из предыдущего упражнения и возвращающий сумму значе-
 * ний в файле. Организуйте распространение любых исключений вызывающе-
 * му коду.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Pr2 {
    public static void main(String[] args) throws Throwable {
        System.out.println(sumOfValues("C:\\Users\\Skaren\\Desktop\\21\\task\\task\\Chapter 5\\ex01\\test"));
    }

    public static double sumOfValues(String filename) throws Throwable{
        double sum = 0;
        ArrayList<Double> arrayList = readValues(filename);
        for (Double aDouble : arrayList) {
            sum += aDouble;
        }
        return sum;
    }

    public static ArrayList<Double> readValues(String filename) throws Throwable {
        ArrayList<Double> arrayList = new ArrayList<>();
        byte[] buff;
        FileInputStream fileInputStream = new FileInputStream(filename);
        buff = new byte[fileInputStream.available()];
        fileInputStream.read(buff, 0, buff.length);
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
            arrayList.add(Double.parseDouble(s));
        }
        return arrayList;
    }
}
