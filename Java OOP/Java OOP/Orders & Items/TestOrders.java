
public class TestOrders{

    public static void main(String[] args){

        //Menu items
        // Item item1 = new Item("mocha", 2.50);

        // item1.name = "mocha";
        // item1.price = 2.50;

        Item item1 = new Item();
        item1.setName("mocha");
        item1.setPrice(4.25);

        Item item2 = new Item();
        item2.setName("latte");
        item2.setPrice(3.50);

        Item item3 = new Item();
        item3.setName("drip coffee");
        item3.setPrice(1.75);

        Item item4 = new Item();
        item4.setName("cappuccino");
        item4.setPrice(2.95);



        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.setName("Cindhuri");
        // System.out.println(order1);

        Order order2 = new Order();
        order2.setName("Jimmy");

        Order order3 = new Order();
        order3.setName("Noah");

        Order order4 = new Order();
        order4.setName("Sam");
        

        order2.setItems(item1);
        System.out.println("order 2:    " + order2.getItems());
        order2.setTotal(item1.getPrice());

        order3.setItems(item4);
        order3.setTotal(item4.getPrice());

        order4.setItems(item2);
        order4.setTotal(item2.getPrice());

        order1.setReady(true);
        System.out.println(order1.isReady());

        order4.setItems(item2);
        order4.setTotal(item2.getPrice());
        order4.setItems(item2);
        order4.setTotal(item2.getPrice());
        System.out.println(order4.getTotal());

        order2.setReady(true);
        
    }
}