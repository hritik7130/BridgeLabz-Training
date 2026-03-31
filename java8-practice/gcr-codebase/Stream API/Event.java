import java.util.*;

public class Event {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Tanishq", "Rahul", "Aman");

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name)
        );
    }
}
