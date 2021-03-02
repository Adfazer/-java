/*
 * Повторите предыдущее упражнение, но на этот раз сделайте методы t r a n s
 * la t e () и s c a le () модифицирующими.
 */

public class Program006 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
