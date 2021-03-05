public class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return (super.toString() + ", label=" + this.label);
    }

    public boolean equals(LabeledPoint point) {
        if (this == point) return true;
        if (point == null) return false;
        return super.equals((Point)point) && this.label.equals(point.getLabel());
    }

    public int hashCode() {
        return super.hashCode() + this.label.hashCode();
    }
}
