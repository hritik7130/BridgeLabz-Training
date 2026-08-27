package ScenarioBased;

import java.util.*;

public class MultipleWords {

    public static int mostFrequentLength(String str) {

        String[] words = str.split("\\s+");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        int maxFrequency = 0;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "I love java and I love coding";

        System.out.println(mostFrequentLength(str));
    }
}
