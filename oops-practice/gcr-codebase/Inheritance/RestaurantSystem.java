// Interface defining work behavior
interface Worker {
    // Any class implementing Worker must define this method
    void performDuties();
}

// Superclass
class Person {
    String name;
    int id;

    // Constructor to initialize common person details
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Chef class (inherits Person and implements Worker)
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id); // calling parent constructor
    }

    // Unique implementation for Chef
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food");
    }
}

// Waiter class (inherits Person and implements Worker)
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    // Unique implementation for Waiter
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food to customers");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {

        // Polymorphism using interface reference
        Worker w1 = new Chef("Amit", 101);
        Worker w2 = new Waiter("Rahul", 102);

        w1.performDuties();
        w2.performDuties();
    }
}