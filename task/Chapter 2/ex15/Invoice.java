import java.util.ArrayList;

public class Invoice {
    private ArrayList<Item> items = new ArrayList<>() ;

    private static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() { return quantity * unitPrice; }
    }

    public void addltem(String description, int quantity, double unitPrice) {
        Item newltem = new Item(description, quantity, unitPrice);
        items.add(newltem);
    }

    public void display() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("description " + items.get(i).description + " quantity " + items.get(i).quantity + " unitPrice " + items.get(i).unitPrice);
        }
    }
}
