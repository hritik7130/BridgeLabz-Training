import java.util.Scanner;

public class StringIndexExceptionDemo {

 
    public static void generateException(String input) {

        char ch = input.charAt(10);  
        System.out.println("Character at index 10: " + ch);
    }

    public static void handleException(String input) {
        try {
            char ch = input.charAt(10);  
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();


        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }

       
        System.out.println("--- Handling Exception ---");
        handleException(userInput);
    }
}