package Day3;



import java.util.*;

public class PrimeNumber {

    static String primality(int n) {
        if (n <= 1) return "Not prime";
        if (n == 2) return "Prime";
        if (n % 2 == 0) return "Not prime";

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return "Not prime";
        }

        return "Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();

        while (p-- > 0) {
            int n = sc.nextInt();
            System.out.println(primality(n));
        }

        sc.close();
    }
}
