package Day10;

import java.io.*;
import java.util.*;

public class Anagram {

 static boolean isAnagram(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();
        
        char [] ch1=a.toCharArray();
        char [] ch2=b.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
         
         return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        
           Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        boolean result = isAnagram(a, b);

        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
