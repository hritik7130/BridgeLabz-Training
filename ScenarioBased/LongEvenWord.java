package ScenarioBased;

public class LongEvenWord {

    public static void main(String[] args) {

        String sentence = "I am learning Java programming";

        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
