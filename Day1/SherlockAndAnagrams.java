package Day1;

import java.util.*;

public class SherlockAndAnagrams {


    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                char[] chars = s.substring(i, j).toCharArray();
                Arrays.sort(chars); 
                String key = new String(chars);

                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int count = 0;


        for (int freq : map.values()) {
            count += freq * (freq - 1) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println(sherlockAndAnagrams(s));
        }

        sc.close();
    }
}
