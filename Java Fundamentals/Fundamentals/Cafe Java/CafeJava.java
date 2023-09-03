public class CafeJava {

    public static void main(String[] args) {
        // App Variables
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 2.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //

        // Cindhuri ordered a coffee. Based on her order status, print the correct
        // status message to the console.
        System.out.println(customer1 + pendingMessage);

        /*
         * Noah ordered a cappuccino. Use an if statement to check the status of his
         * order and print the correct status message. If it is ready, also print the
         * message to display the total. Note: Outcomes may be different depending on
         * what you assigned as the status.
         */
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        /*
         * Sam just ordered 2 lattes, print the message to display their total. Next,
         * use an if statement to print the appropriate order status message. Change the
         * isReady flag value from true to false or vice versa in order to test your
         * control logic (if-statement).
         */
        System.out.println(displayTotalMessage + (lattePrice * 2));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        /*
         * Jimmy just realized he was charged for a coffee but had ordered a latte.
         * Print the total message with the new calculated total (what he owes) to make
         * up the difference.
         */
        // System.out.println(displayTotalMessage + Math.abs(lattePrice -
        // dripCoffeePrice));
        // System.out.println(customer3 + " owes " + (lattePrice - dripCoffeePrice));
        System.out.printf("%s owes $%.2f", customer3 ,(lattePrice-dripCoffeePrice));
    }
}