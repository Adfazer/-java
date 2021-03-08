/*
 * Напишите метод p u b l i c A r r a y L i s t < D o u b l e > r e a d V a lu e s ( S t r i n g f ile n a m e )
 * t h r o w s ..., читающий числа с плавающей точкой из файла. Сгенерируйте
 * подходящие исключения, если файл не удается открыть или же если введены
 * данные, не относящиеся к числам с плавающей точкой.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Pr1 {
    public static void main(String[] args) throws IOException {

        ArrayList<Double> arrayList = readValues("C:\\Users\\Skaren\\Desktop\\21\\task\\task\\Chapter 5\\ex01\\test");
        System.out.println(arrayList.toString());
    }

    public static ArrayList<Double> readValues(String filename) throws IOException {
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
