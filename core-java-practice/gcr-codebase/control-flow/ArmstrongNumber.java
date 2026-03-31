import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // get last digit
            sum = sum + (digit * digit * digit); // cube and add
            originalNumber = originalNumber / 10; // remove last digit
        }

        if (sum == number)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is not an Armstrong Number");
        sc.close();
    }
}
