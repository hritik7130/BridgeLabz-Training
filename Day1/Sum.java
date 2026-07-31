package Day1;
import java.util.*;
public class Sum {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The sum of the array is: " + sum(arr));

            
        }
    
}
