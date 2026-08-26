package ScenarioBased;

import java.util.*;

public class ReverseString {

    public static String reverseString(Object input) {

        if (input instanceof String) {
            String str = (String) input;
            return new StringBuilder(str).reverse().toString();
        }

        throw new IllegalArgumentException("Invalid input");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
           
            if (input.matches("\\d+")) {
                throw new IllegalArgumentException("Invalid input");
            }

            System.out.println(reverseString(input));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}