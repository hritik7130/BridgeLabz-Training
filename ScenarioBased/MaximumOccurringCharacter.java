package ScenarioBased;

import java.util.*;

public class MaximumOccurringCharacter {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

       
        for (char ch : str.toCharArray()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
    }
}
