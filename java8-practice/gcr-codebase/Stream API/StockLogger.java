import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(102.5, 104.8, 101.2);

        prices.forEach(p -> System.out.println("Stock Price: " + p));
    }
}
