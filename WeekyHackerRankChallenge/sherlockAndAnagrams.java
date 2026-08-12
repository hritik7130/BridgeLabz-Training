package WeekyHackerRankChallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
    int count = 0;

    for (int i = 0; i < s.length(); i++) {

        for (int j = i + 1; j < s.length(); j++) {

            int[] freq1 = new int[26];

            for (int k = i; k < j; k++) {
                freq1[s.charAt(k) - 'a']++;
            }

            for (int k = i + 1; k < s.length(); k++) {

                int length = j - i;

                if (k + length > s.length()) {
                    break;
                }

                int[] freq2 = new int[26];

                for (int l = k; l < k + length; l++) {
                    freq2[s.charAt(l) - 'a']++;
                }

                if (Arrays.equals(freq1, freq2)) {
                    count++;
                }
            }
        }
    }

    return count;

    }

}

public class sherlockAndAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

