// Superclass
class BankAccount {
    int accountNumber;
    double balance;

    // Constructor for common account details
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to be overridden by subclasses
    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Savings Account subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // calling parent constructor
        this.interestRate = interestRate;
    }

    // Overridden method
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Checking Account subclass
class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
}