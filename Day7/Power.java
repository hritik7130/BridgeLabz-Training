package Day7;
import java.util.Scanner;

public class Power {
 public static int power(int base,int exponent ){
    if(exponent ==0){
        return 1;

    }
     return base*power(base,exponent-1);
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent=sc.nextInt();
        int result=power(base,exponent);
        System.out.println("The result is: "+result);
        
    }
    
}
