package ScenarioBased;

import java.util.*;

abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator {

   
    int add(int a, int b) {
        System.out.println("Adding: " + a + " " + b);
        return a + b;
    }
}

class Multiplier {

    Adder adder = new Adder();

    int multiply(int a, int b) {
        System.out.println("Multiplying: " + a + " " + b);

        int result = 0;

        for (int i = 0; i < b; i++) {
            result = adder.add(result, a);
        }

        return result;
    }
}

public class MathematicsOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder adder = new Adder();

        int sum = adder.add(a, b);
        System.out.println("Sum: " + sum);

        Multiplier multiplier = new Multiplier();

        int result = multiplier.multiply(a, b);
        System.out.println("Product: " + result);
    }
}
