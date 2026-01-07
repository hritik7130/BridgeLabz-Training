import java.util.*;

public class FrequencyExample {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = findFrequency(fruits);
        System.out.println(result);
    }
}