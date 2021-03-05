/*
 * Определите методы t o S t r i n g ( ), e q u a ls () и h a sh C o d e () для классов из преды-
 * дущего упражнения.
 */

public class Prog2 {
    public static void main(String[] args) {
        Point point = new Point(22.2, 122.2);
        Point point1 = new Point(22.1, 122.2);
        System.out.println(point.toString());
        System.out.println(point.equals(point1));
        System.out.println(point.hashCode() == point1.hashCode());
        LabeledPoint point2 = new LabeledPoint("qqq", 1, 2);
        LabeledPoint point3 = new LabeledPoint("qqq", 1, 2);
        System.out.println(point2.toString());
        System.out.println(point2.equals(point3));
        System.out.println(point2.hashCode() == point3.hashCode());
    }
}
