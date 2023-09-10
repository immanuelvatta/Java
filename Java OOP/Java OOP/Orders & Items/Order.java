import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // public Order(String name, double total, boolean ready, ArrayList<Item> items)
    // {
    // this.name = name;
    // this.total = total;
    // this.ready = ready;
    // this.items = items;
    // }

    public Order() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(Item item) {
        this.items.add(item);
    }

}
