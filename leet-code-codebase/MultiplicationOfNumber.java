import java.util.*;

public class MultiplicationOfNumber {
    // Creating main method 
    public static void main(String[] args) {

    
    //input
    
    Scanner sc =new Scanner(System.in);
    int number =sc.nextInt();
    // Initialize an array
    int table[]= new int[10] ;

    for(int index=1;index<=10;index++){
        table[index-1]=number*index;


    }
    for(int index= 1;index<=10;index++){
        System.out.println(number + "*" + index + "=" + table[index-1]);
    }
}}
