/*
 * Реализуйте неизменяемый класс P o in t , описывающий точку на плоскости.
 * Предоставьте его конструктор, чтобы задать конкретную точку; конструктор
 * без аргументов, чтобы задать точку в начале координат; а также методы g e t X (),
 *
 * g e tY (), t r a n s l a t e ( ) и s c a l e ( ) . В частности, метод t r a n s l a t e () должен пере-
 * мещать точку на определенное расстояние в направлении координат x и у,
 *
 * метод s c a le () — изменять масштаб по обеим координатам на заданный коэф-
 * фициент. Реализуйте эти методы таким образом, чтобы они возвращали новые
 *
 * точки в качестве результата. Например, в следующей строке кода:
 * Point р = new Point(3, 4).translate(1, 3).scale(0.5);
 * в переменной р должна быть установлена точка с координатами (2, 3,5).
 */

public class Program005 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}