// Base class
class Order {
    int orderId;
    String orderDate;

    // Constructor for base order
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass representing shipped order
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor for shipped order
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);  // calling parent constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding order status
    String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass representing delivered order
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor for delivered order
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);  // calling parent constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding order status
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRetailSystem {
    public static void main(String[] args) {

        Order o1 = new Order(101, "10-09-2025");
        Order o2 = new ShippedOrder(102, "11-09-2025", "TRK12345");
        Order o3 = new DeliveredOrder(103, "12-09-2025", "TRK67890", "15-09-2025");

        System.out.println("Order 101 Status: " + o1.getOrderStatus());
        System.out.println("Order 102 Status: " + o2.getOrderStatus());
        System.out.println("Order 103 Status: " + o3.getOrderStatus());
    }
}