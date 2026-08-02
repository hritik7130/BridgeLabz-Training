package Day1;
import java.util.*;

public class SplitString {


    public static void tokenize(String s) {
        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        
        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        tokenize(s);

        sc.close();
    }
}
