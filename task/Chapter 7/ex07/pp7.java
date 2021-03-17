/*
 * Напишите программу для чтения всех слов из файла и вывода частоты, с ко-
 * торой каждое слово встречается в нем. Воспользуйтесь для этой цели классом
 *
 * TreeMap<String, IntegerX
 */

import com.sun.source.tree.Tree;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class pp7 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> treeMap = readValues("C:\\Users\\Skaren\\Desktop\\21\\task\\task\\Chapter 7\\ex07\\file");
        System.out.println(treeMap.toString().replaceAll(", ", "\n"));
    }

    public static TreeMap<String, Integer> readValues(String filename) throws IOException {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
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
        string = string.replaceAll("-" ,"");
        string = string.replaceAll("," ,"");
        string = string.replaceAll("\\." ,"");
        string = string.replaceAll("\\[", "");
        string = string.replaceAll("]", "");
        String[] subst;
        subst = string.split(" ");
        for (String s : subst) {
            if (treeMap.containsKey(s) == false)
                treeMap.put(s, 1);
            else
                treeMap.put(s, treeMap.get(s) + 1);
        }
        return treeMap;
    }
}
