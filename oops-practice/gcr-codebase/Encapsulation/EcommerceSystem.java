import java.util.*;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    protected double price;

    Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double getFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }

    void display() {
        System.out.println(name + " Final Price: " + getFinalPrice());
    }
}

// Electronics
class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST";
    }
}

// Clothing
class Clothing extends Product {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

// Groceries
class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.05;
    }
}

class EcommerceSystem {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Electronics(1, "Laptop", 60000),
                new Clothing(2, "Shirt", 2000),
                new Groceries(3, "Rice", 1000)
        );

        for (Product p : products) {
            p.display();
        }
    }
}