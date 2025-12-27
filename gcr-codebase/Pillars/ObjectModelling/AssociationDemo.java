import java.util.ArrayList;

// Customer class
class Customer {
    String name;
    double balance;

    // Constructor to initialize customer
    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Method to view balance
    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

// Bank class
class Bank {
    String bankName;
    ArrayList<Customer> customers;  // Bank is associated with customers

    // Constructor to initialize bank
    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Method to open account for customer
    void openAccount(Customer customer, double initialDeposit) {
        customer.balance = initialDeposit;
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        Customer c1 = new Customer("Tanishq");
        Customer c2 = new Customer("Rahul");

        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}