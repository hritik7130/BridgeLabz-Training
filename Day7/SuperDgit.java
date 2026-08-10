package Day7;
import java.util.Scanner;

public class SuperDgit {
    public static int superDigit(String n, int k) {

    long sum = 0;

   
    for (char ch : n.toCharArray()) {
        sum += ch - '0';
    }

 
    sum = sum * k;

    return findSuperDigit(sum);
}
public static int findSuperDigit(long n) {

    if (n < 10) {
        return (int) n;
    }

    long sum = 0;

    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }

    return findSuperDigit(sum);
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();   
        System.out.println("Enter the key value");
        int k=sc.nextInt();
        
        if(superDigit(str, k)<10){
            System.out.println("The super digit is: "+superDigit(str,k));
        }
        else{
            System.out.println("not a super digit");

        }
    }
    
}   
