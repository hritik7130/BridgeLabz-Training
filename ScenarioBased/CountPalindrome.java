package ScenarioBased;

import java.util.*;

public class CountPalindrome{

    public static int countPalindromes(List<List<String>> list) {

        int count = 0;

        for (List<String> row : list) {

            for (String str : row) {

                if (isPalindrome(str)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
            Arrays.asList("madam", "hello", "level"),
            Arrays.asList("world", "racecar", "java"),
            Arrays.asList("noon", "test")
        );

        System.out.println(countPalindromes(list));
    }
}