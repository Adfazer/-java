/*
 * Почему в Java нельзя реализовать метод, меняющий местами содержимое двух
 * переменных типа i n t ? Вместо этого напишите метод, меняющий местами
 * содержимое двух объектов типа In t H o ld e r . (Описание этого малоизвестного
 *
 * класса можно найти в документации на прикладной программный интер-
 * фейс Java API.) Можно ли поменять местами содержимое двух объектов типа
 *
 * In t e g e r ?    ?????????????
 */

// копия по знаечнию

public class Program004 {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 4;
        System.out.println(a + "   " + b);
        Integer c = a;
        a = b;
        b = c;
        System.out.println(a + "   " + b);

        int q = 8;
        int w = 9;
        System.out.println(q + " " + w);
        q = returnFirst(w, w = q);
        System.out.println(q + " " + w);
    }

    public static <T> T returnFirst(final T first, final T second) {
        return first;
    }
}