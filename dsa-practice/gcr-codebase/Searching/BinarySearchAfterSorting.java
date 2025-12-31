import java.util.Arrays;

public class BinarySearchAfterSorting {

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 8, 2};
        int target = 8;

        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}