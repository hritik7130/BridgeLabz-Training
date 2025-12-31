public class BankAccount {

    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Static method to display bank name
    public static void displayBank() {
        System.out.println("\t\t\t\tState of Chennai\t\t\t\t");
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount to deposit must be positive");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Lynda", "123456789", 700.00);

        displayBank();

        account.displayBalance();

        account.deposit(200.00);
        account.displayBalance();

        account.withdraw(100.00);
        account.displayBalance();

        account.withdraw(900.00);
    }
}