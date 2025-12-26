// Superclass
class Animal {
    String name;
    int age;

    // Constructor to initialize common properties
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog subclass
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    void makeSound() {
        System.out.println(name + " says: Bark Bark");
    }
}

// Cat subclass
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    void makeSound() {
        System.out.println(name + " says: Meow");
    }
}

// Bird subclass
class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}