package ScenarioBased;

public class EvenSubString {

    public static String longestEvenSubstring(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 2; j <= str.length(); j += 2) {

                String sub = str.substring(i, j);

                if (sub.length() > result.length()) {
                    result = sub;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "abcdefghi";

        System.out.println(longestEvenSubstring(str));
    }
}
