public class Circle extends Share implements Cloneable{

    public Circle(Point center, double radius) {
        super();
        this.moveBy(center.getX(), center.getY());
    }
    @Override
    public Point getCenter() {
        return new Point(this.getX(), this.getY());
    }

    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
