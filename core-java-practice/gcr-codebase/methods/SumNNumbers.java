import java.util.Scanner;

public class SumNNumbers {

    
    static int sumUsingRecursion(int n) {
        if (n == 0)
            return 0;
        return n + sumUsingRecursion(n - 1);
    }

  
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
