import java.util.Objects;

public class DiscountedItem extends Item{
    protected int discounted;

    public DiscountedItem(String description, double price, int discounted) {
        super(description, price);
        this.discounted =  discounted;
    }

    public boolean equals(Object otherObject) {
        if (otherObject instanceof Item && getClass() != otherObject.getClass())
            return super.equals(otherObject);
        if (otherObject == null) return false;
        assert otherObject instanceof DiscountedItem;
        DiscountedItem other = (DiscountedItem) otherObject;
        return Objects.equals(description, other.description)
                && price == other.price && discounted == other.discounted;
    }

    public int hashCode() {
        return  super.hashCode() + discounted * 29;
    }
}
