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

    public String toString() {
        return ("x=" + this.x +", y=" + this.y);
    }

    public boolean equals(Point point) {
        if (this == point) return true;
        if (point == null) return false;
        return point.getX() == this.x && point.getY() == this.y;
    }

    public int hashCode() {
        return (int) (this.x + this.y * 29);
    }
}
