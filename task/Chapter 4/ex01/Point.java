/*
 * Определите класс P o in t с конструктором P o in t (d o u b le х, d o u b le у) и мето-
 * дами доступа g e t X (), g e t Y ( ) . Определите также подкласс L a b e le d P o in t с кон-
 * структором L a b e l e d P o i n t ( S t r i n g l a b e l , d o u b le x , d o u b le y) pi методом
 *
 * доступа g e t L a b e l ().
 */

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
