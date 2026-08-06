package Review;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
    int max=0;
    for( char c1 ='a'; c1<= 'z'; c1++){
        for(char c2= (char)(c1+1); c2<='z';c2++){
            StringBuilder   sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch==c1|| ch==c2){
                    sb.append(ch);
                    
                }
            }
            boolean valid =true;
            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i)==sb.charAt(i-1)){
                    valid =false;
                    break;
                }
            }
            if (valid&& sb.length()>=2){
                max=Math.max(max,sb.length());
            }
            
            
        }
        
    }
    return max;

    }

}

public class TwoCharacters{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
