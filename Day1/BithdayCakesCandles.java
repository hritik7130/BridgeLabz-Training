package Day1;
import java.util.*;

public class BithdayCakesCandles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of candles: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the height of the candles: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count=1;
            } else if(arr[i]==max){
                count++;    
        
    }  
    System.out.println("Number of candles that can be blown out: " + count);

}}}
