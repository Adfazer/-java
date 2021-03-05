public class Rectangle extends Share implements Cloneable {
    public Rectangle(Point topLeft, double width, double height) {
        this.moveBy(topLeft.getX() - height / 2, topLeft.getY() + width / 2);
    }

    @Override
    public Point getCenter() {
        return new Point(this.getX(), this.getY());
    }

    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
