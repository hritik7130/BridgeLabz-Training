import java.util.*;
import java.util.stream.*;

public class WordCounter {
    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        Map<String, Integer> wordCount =
            Arrays.stream(text.split(" "))          // split sentence into words
                  .collect(Collectors.toMap(
                      word -> word,                // key = word
                      word -> 1,                   // initial count
                      Integer::sum                 // merge if duplicate
                  ));

        System.out.println(wordCount);
    }
}
