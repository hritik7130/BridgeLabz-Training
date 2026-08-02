package Day1;

import java.util.*;

public class ArrayManipulation{

  
    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 2];

     
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long max = 0;
        long sum = 0;

     
        for (int i = 1; i <= n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }

        System.out.println(arrayManipulation(n, queries));

        sc.close();
    }
}
