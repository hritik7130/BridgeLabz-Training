// Interface
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

// Abstract class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    abstract double calculateInterest();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied (Savings)");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

// Current Account
class CurrentAccount extends BankAccount {

    CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return 0;
    }
}

class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Tanishq", 50000);
        BankAccount acc2 = new CurrentAccount(102, "Rahul", 40000);

        System.out.println("Interest: " + acc1.calculateInterest());
        System.out.println("Interest: " + acc2.calculateInterest());

        ((Loanable)acc1).applyForLoan();
    }
}