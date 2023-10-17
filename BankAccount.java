// WAP to create class naming "BankAccount" having fields id, balance, and Account holder name. Provide constructors, instance methods like printAccountDetails, deposit and withdraw. One static method which returns total accounts created.

public class BankAccount {
    private static int totalAccounts = 0;

    private int id;
    private double balance;
    private String accountHolderName;

    public BankAccount(int id, double balance, String accountHolderName) {
        this.id = id;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public void printAccountDetails() {
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 1000, "John Doe");
        BankAccount account2 = new BankAccount(2, 1500, "Jane Smith");

        account1.printAccountDetails();
        account1.deposit(200);
        account1.withdraw(100);

        account2.printAccountDetails();
        account2.deposit(500);
        account2.withdraw(200);

        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
