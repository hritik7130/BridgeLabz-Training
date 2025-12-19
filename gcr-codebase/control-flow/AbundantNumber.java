import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner.in);
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check abundance
        if (sum > number)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
        sc.close();
    }
}
