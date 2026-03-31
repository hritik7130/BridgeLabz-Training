public class QuickSortDemo {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = n - i;

        long start = System.nanoTime();
        quickSort(arr, 0, n - 1);
        long end = System.nanoTime();

        System.out.println("Quick Sort Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}