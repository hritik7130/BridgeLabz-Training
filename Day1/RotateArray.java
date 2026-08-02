package Day1;
  import java.util.*;

public class RotateArray {
  



    
    public static int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        d = d % n; 

        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + d) % n];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of elements in the array and the number of rotations: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of left rotations: ");
        int d = sc.nextInt();

       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int[] result = rotateLeft(d, arr);

   
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

