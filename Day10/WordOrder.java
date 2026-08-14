package Day10;


import java.util.*;

public class WordOrder{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Number of distinct words
        System.out.println(map.size());

        // Occurrences in first-appearance order
        for (int count : map.values()) {
            System.out.print(count + " ");
        }

        sc.close();
    }
}
