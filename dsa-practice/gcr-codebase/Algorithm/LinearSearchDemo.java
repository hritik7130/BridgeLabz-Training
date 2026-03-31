import java.util.*;

public class LinearSearchDemo {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;

        int target = n - 1;

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();

        System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}