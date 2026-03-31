public class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }

   
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));      
        System.out.println(c.add(10, 20, 30));  
        System.out.println(c.add(10.5, 5.5));    
    }
}

class Vehicle {

    void speed() {
        System.out.println("Vehicle has normal speed");
    }
}

class Car extends Vehicle {

    @Override
    void speed() {
        System.out.println("Car has high speed");
    }

    public static void main(String[] args) {
        Vehicle v = new Car(); // 
        v.speed();
    }
}
