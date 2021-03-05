public class Line extends Share implements Cloneable {
    public Line(Point from, Point to) {
        this.moveBy((from.getX() + to.getX()) / 2, (from.getY() + to.getY()) / 2);
    }

    @Override
    public Point getCenter() {
        return new Point(this.getX(), this.getY());
    }

    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
