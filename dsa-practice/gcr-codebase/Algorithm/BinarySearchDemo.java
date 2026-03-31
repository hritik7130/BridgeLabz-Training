import java.util.*;

public class BinarySearchDemo {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
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
        binarySearch(arr, target);
        long end = System.nanoTime();

        System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}