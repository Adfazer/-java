public abstract class Share {
    private Point p;

    public Share() {
        p = new Point();
    }

    public double getX() {
        return p.getX();
    }

    public double getY() {
        return p.getY();
    }

    public void moveBy(double dx, double dy) {
        p.setX(p.getX() + dx);
        p.setY(p.getY() + dy);
    }

    public abstract Point getCenter();
}
