import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numOfWeeks) {
        int sum = 0;
        for (int i = 1; i <= numOfWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum; 
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + ". " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        int customersCount = customers.size();
        System.out.println("There are " + customersCount + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

}