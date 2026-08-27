package ScenarioBased;
import java.util.*;

public class OneCommanCharacter{

    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>(
            Arrays.asList("hello", "world", "java")
        );

        ArrayList<String> B = new ArrayList<>(
            Arrays.asList("apple", "cat", "python")
        );

        for (int i = 0; i < A.size(); i++) {

            boolean found = false;

            for (int j = 0; j < A.get(i).length(); j++) {

                char ch = A.get(i).charAt(j);

                if (B.get(i).indexOf(ch) != -1) {
                    found = true;
                    break;
                }
            }

            System.out.println(found);
        }
    }
}
