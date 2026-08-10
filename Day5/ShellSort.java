package Day5;
public class ShellSort {

    static void shellSort(int[] arr) {

        int n = arr.length;

        int comparisons = 0;
        int shifts = 0;

       
        for (int gap = n / 2; gap > 0; gap /= 2) {

            System.out.println("Gap = " + gap);

            for (int i = gap; i < n; i++) {

                int temp = arr[i];
                int j = i;

                while (j >= gap) {

                    comparisons++;

                    if (arr[j - gap] > temp) {
                        arr[j] = arr[j - gap];
                        shifts++;
                        j -= gap;
                    } else {
                        break;
                    }
                }

                arr[j] = temp;
            }

            printArray(arr);
        }

        System.out.println("Comparisons = " + comparisons);
        System.out.println("Shifts = " + shifts);
    }

    static void printArray(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        shellSort(arr);
    }
}
