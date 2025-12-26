class Product {

    // Static variable (shared discount)
    static double discount = 10.0;   // percentage

    // Instance variables
    String productName;
    double price;
    int quantity;
    final int productID;            // final variable

    // Constructor using this keyword
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to process and display product details
    void processProduct(Object obj) {
        if (obj instanceof Product) {
            double totalPrice = price * quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);

            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price per Unit: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: " + discountedPrice);
        } else {
            System.out.println("Invalid Product Object");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000, 1, 201);
        Product p2 = new Product("Headphones", 2000, 2, 202);

        Product.updateDiscount(15.0);

        p1.processProduct(p1);
        System.out.println();
        p2.processProduct(p2);
    }
}