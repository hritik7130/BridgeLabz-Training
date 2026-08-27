package ScenarioBased;



public class WordStartEndVowel {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "umbrella", "cat", "Eye"};

        for (String word : words) {

            if (word.length() > 0 &&
                isVowel(word.charAt(0)) &&
                isVowel(word.charAt(word.length() - 1))) {

                System.out.println(word);
            }
        }
    }
}