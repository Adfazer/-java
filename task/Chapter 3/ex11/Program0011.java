/*
 * Используя метод l i s t ( F i l e n a m e F i l t e r ) из класса j a v a . i o . F i l e , напишите
 *
 * метод, возвращающий все файлы из заданного каталога с указанным расшире-
 * нием. Воспользуйтесь для этой цели лямбда-выражением вместо объекта типа
 *
 * F ile n a m e F ilt e r . Какая переменная из объемлющей области действия захваты-
 * вается лямбда-выражением? ?????????
 */

import java.io.File;
import java.util.ArrayList;

public class Program0011 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        File folder = new File("~/../task");
        System.out.println(listFilesForFolder(folder, list).toString());
    }
    public static ArrayList<String> listFilesForFolder(File folder, ArrayList<String> list) {
        for (int i = 0; i < folder.listFiles().length; i++) {
            if (folder.listFiles()[i].isDirectory()) {
                listFilesForFolder(new File(folder.listFiles()[i].getPath()), list);
            }
            else {
                list.add(folder.listFiles()[i].getName());
            }
        }
        return list;
    }
}
