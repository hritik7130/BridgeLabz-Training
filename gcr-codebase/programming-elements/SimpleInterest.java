import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();        
        double rate = scanner.nextDouble();             
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest for principal " + principal + ", rate " + rate + "%, over " + time + " years is: " + simpleInterest);
        scanner.close();
    }
}