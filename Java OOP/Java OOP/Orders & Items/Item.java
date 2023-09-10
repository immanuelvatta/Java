public class Item {
    
    private String name;
    private double price;

    public Item(){}


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %.2f", getName(), getPrice());
    }

}
