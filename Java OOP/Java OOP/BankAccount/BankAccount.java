public class BankAccount {
    // MEMBER VARIABLES
    private String accountNumber = "";
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static Double totalMoney = 0.00; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR

    // Be sure to increment the number of accounts
    public BankAccount() {
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        accounts++;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber() {
        String randomNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 10; i++) {
            int idx = (int) (Math.random() * randomNum.length());
            char randomChar = randomNum.charAt(idx);
            accountNumber += randomChar;
        }
        return accountNumber;
    }

    
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    public void deposit(double depositAmount, String accountType) {
        if (accountType.equals("checking")) {
            this.checkingBalance += depositAmount;
            System.out.println("Deposited $" + depositAmount + " into checking account");
        } else if (accountType.equals("savings")) {
            this.savingsBalance += depositAmount;
            System.out.println("Deposited $" + depositAmount + " into savings account");
        } else {
            System.out.println("Invalid account type, please select either checking or savings");
        }
        totalMoney += depositAmount;
    }

    // account
    // withdraw
    // - users should be able to withdraw money from their checking or savings
    public void withdraw(double withdrawalAmount, String accountType) {
        if (accountType.equals("checking")) {
            if (withdrawalAmount <= this.checkingBalance) {
                this.checkingBalance -= withdrawalAmount;
                totalMoney -= withdrawalAmount;
                System.out.println("Withdrew $" + withdrawalAmount + " from checking account");
            } else {
                System.out.println("Insufficient funds in checking account");
            }
        } else if (accountType.equals("savings")) {
            if (withdrawalAmount <= this.savingsBalance) {
                this.savingsBalance -= withdrawalAmount;
                totalMoney -= withdrawalAmount;
                System.out.println("Withdrew $" + withdrawalAmount + " from savings account");
            } else {
                System.out.println("Insufficient funds in savings account");
            }
        } else {
            System.out.println("Invalid account type, please select either checking or savings");
        }
    }

    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    public void getBalance() {
        System.out.println("Checking Balance: $" + this.checkingBalance);
        System.out.println("Savings Balance: $" + this.savingsBalance);
    }

    // - display total balance for checking and savings of a particular bank account
    public static void getTotalMoney() {
        System.out.println("Total money in the Bank: $" + totalMoney);
    }
}
