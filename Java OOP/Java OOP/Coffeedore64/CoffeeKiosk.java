import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {

    private ArrayList<Item> menu;

    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(double price, String name) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size()); // Set the index based on the current size of the menu
        menu.add(newItem);
    }

    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ": " + menu.get(i).getName() + ": $" + menu.get(i).getPrice());
        }
    }

    // newOrder
    // The newOrder method will take input from the user in the terminal to create a
    // new order instance and add it to the orders array. We have given you some
    // code to get you started.
    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        Order newOrder = new Order(name);
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    Item item = menu.get(index);
                    newOrder.addItem(item);
                } else {
                    System.out.println("Invalid index. Please enter a valid menu item index");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid menu item index");
            }
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();

        }
        // After you have collected their order, print the order details
        newOrder.display();
    }
}
