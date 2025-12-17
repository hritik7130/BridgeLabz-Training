import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int factor_count=0;
        for(int i=2;i<input/2+1;i++){
            if(input%i==0){
                factor_count++;
            }
        }
        int[] factors=new int[factor_count+2];
        int factor_ptr=0;
        for(int i=1;i<input/2+1;i++){
            if(input%i==0){
                factors[factor_ptr]=i;
                factor_ptr++;
            }
        }
        factors[factor_ptr]=input;
        System.out.print("factors" + Arrays.toString(factors));
    }
}