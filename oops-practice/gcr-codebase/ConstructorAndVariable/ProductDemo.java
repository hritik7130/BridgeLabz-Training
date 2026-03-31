public class ProductDemo {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 3000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}

class Product {


    String productName;
    double price;

 
    static int totalProducts = 0;

    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

   
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

   
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}