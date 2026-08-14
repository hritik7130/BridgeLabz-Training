package Day10;

import java.util.*;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < msg.length(); i++) {

            // If next character is same, increase count
            if (i + 1 < msg.length() && msg.charAt(i) == msg.charAt(i + 1)) {
                count++;
            } 
            else {
                // Add character
                result.append(msg.charAt(i));

                // Add count only if character occurs more than once
                if (count > 1) {
                    result.append(count);
                }

                count = 1;
            }
        }

        System.out.println(result);

        sc.close();
    }
}