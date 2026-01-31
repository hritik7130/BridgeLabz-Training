import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Tanishq", 1200),
            new Order("Rahul", 1500),
            new Order("Tanishq", 800)
        );

        Map<String, Double> revenue =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      o -> o.customer,
                      Collectors.summingDouble(o -> o.amount)
                  ));

        System.out.println(revenue);
    }
}
