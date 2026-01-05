import java.util.ArrayList;
import java.util.List;


interface Category { }

class BookCategory implements Category { }
class ClothingCategory implements Category { }
class GadgetCategory implements Category { }

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public void display() {
        System.out.println(
                "Product: " + name +
                " | Price: ₹" + price +
                " | Category: " + category.getClass().getSimpleName()
        );
    }
}

class DiscountUtil {


    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}

public class OnlineMarketplace {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 25000, new GadgetCategory());

        List<Product<? extends Category>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("Before Discount:");
        for (Product<? extends Category> p : catalog) {
            p.display();
        }

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        for (Product<? extends Category> p : catalog) {
            p.display();
        }
    }
}
