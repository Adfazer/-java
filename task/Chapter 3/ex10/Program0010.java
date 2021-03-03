/*
 * Используя методы l i s t F i l e s ( F i l e F i l t e r ) и i s D i r e c t o r y из класса j a v a .
 *
 * i o . F i l e , напишите метод, возвращающий все подкаталоги из заданного ката-
 * лога. Воспользуйтесь для этой цели лямбда-выражением вместо объекта типа
 *
 * F i l e F i l t e r . Сделайте то же самое, используя ссылку на метод и анонимный
 * внутренний класс. ???????? 
 */

import java.io.File;
import java.util.ArrayList;

public class Program0010 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        File folder = new File("~/../task");
        System.out.println(listFilesForFolder(folder, list).toString());
    }
    public static ArrayList<String> listFilesForFolder(File folder, ArrayList<String> list) {
        for (int i = 0; i < folder.listFiles().length; i++) {
            if (folder.listFiles()[i].isDirectory()) {
                list.add(folder.listFiles()[i].getName());
                listFilesForFolder(new File(folder.listFiles()[i].getPath()), list);
            }
        }
        return list;
    }
}
