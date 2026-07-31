package Day1;
import java.util.*;
public class PlusMinus {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();

   } 
   int positiveCount = 0;
   int negativeCount = 0;
   int zeroCount = 0;
   for(int i=0; i<n; i++){
       if(arr[i] > 0){
           positiveCount++;
       } else if(arr[i] < 0){
           negativeCount++;
       } else {
           zeroCount++;

}}
   double positiveRatio = (double) positiveCount / n;
   double negativeRatio = (double) negativeCount / n;
   double zeroRatio = (double) zeroCount / n;
   System.out.printf("Positive ratio: %.6f\n", positiveRatio);
   System.out.printf("Negative ratio: %.6f\n", negativeRatio);
   System.out.printf("Zero ratio: %.6f\n", zeroRatio);
}
}
