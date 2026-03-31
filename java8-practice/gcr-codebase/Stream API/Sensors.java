import java.util.*;

public class Sensors {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(45, 78, 90, 30);

        readings.stream()
                .filter(r -> r > 50)          // threshold
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}
