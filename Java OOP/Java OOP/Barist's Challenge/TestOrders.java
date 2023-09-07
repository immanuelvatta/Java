import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.99);
        Item item2 = new Item("latte", 2.25);
        Item item3 = new Item("cappuccino", 3.50);
        Item item4 = new Item("drip coffee", 1.75);


    
        // Order variables -- order1, order2 etc.
        System.out.println("----------------------------------------------------------------");
        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();
        System.out.println("----------------------------------------------------------------");
        Order order2 = new Order();
        order2.addItem(item3);
        order2.addItem(item4);
        System.out.println("Order Total: $" + order2.getOrderTotal());
        order2.display();

        System.out.println("----------------------------------------------------------------");
        Order order3 =  new Order("Cindhuri");
        order3.addItem(item1);
        order3.addItem(item3);
        order3.display();

        System.out.println("----------------------------------------------------------------");
        Order order4 =  new Order("Sam");
        order4.addItem(item2);
        order4.addItem(item1);
        System.out.println(order4.getStatusMessage());
        order4.display();

        System.out.println("----------------------------------------------------------------");
        Order order5 =  new Order("Jimmy");
        order5.addItem(item3);
        order5.addItem(item3);
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());
        order5.display();

    
        // Application Simulations
        // Use this example code to test various orders' updates

    }
}
