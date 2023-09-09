import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        coffeeKiosk.addMenuItem(2.50, "cappuccino");
        coffeeKiosk.addMenuItem(3.99, "latte");
        coffeeKiosk.addMenuItem(4.25, "drip coffee");
        coffeeKiosk.addMenuItem(5.75, "mocha");
        coffeeKiosk.newOrder();
    }
}
