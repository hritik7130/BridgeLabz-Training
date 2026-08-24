package Day16;

import java.util.*;

class NumericBox<T extends Number> {
    private T value;

    NumericBox(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Sum {

    static double sumOfList(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println("Integer List Sum: " + sumOfList(intList));
        System.out.println("Double List Sum: " + sumOfList(doubleList));

        NumericBox<Integer> box = new NumericBox<>(100);
        box.display();
    }
}
