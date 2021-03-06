/**
 * объект <code> класса Point</code> описывает точку на плоскости
 * @author Autor_autor
 * @Version 1.0
 */
public final class Point {
    private final double x;
    private final double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает коордианту X
     * @return координата X
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает коордианту Y
     * @return координата Y
     */
    public double getY() {
        return y;
    }

    /**
     * Масштабирует координаты точки
     * @param scale модификатор для координат
     * (например, числовое значение 1.0 означает 100%)
     * @return новый экземпляр класса Point
     */
    public Point scale(double scale) {
        return (new Point(this.x * scale, this.y * scale));
    }

    /**
     * Увеличивает базовые координаты на входящие значения
     * @param x на сколько увеличить по X
     * @param y на сколько увеличить по Y
     * @return новый экземпляр класса Point
     */
    public Point translate(double x, double y) {
        return (new Point(this.x + x, this.y + y));
    }
}
