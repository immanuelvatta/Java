public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit(400.25, "checking");
        account2.deposit(200.20, "savings");
        account3.deposit(333.33, "checking");

        // Withdrawal Test
        account1.withdraw(22.50, "checking");
        account1.withdraw(222.50, "savings");
        account1.withdraw(322.50, "checking");
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Account Number: " + account1.getAccountNumber());
        account1.getBalance();
        System.out.println("Account Number: " + account2.getAccountNumber());
        account2.getBalance();
        System.out.println("Account Number: " + account3.getAccountNumber());
        account3.getBalance();

        BankAccount.getTotalMoney();
    }
}
