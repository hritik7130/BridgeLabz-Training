import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("tanishq", "rahul", "aman");

        names.stream()
             .map(String::toUpperCase)   // convert to uppercase
             .sorted()                   // sort alphabetically
             .forEach(System.out::println);
    }
}
