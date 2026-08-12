package Day8;
import java.util.*;

public class Sustring {

    static void generate(int[] arr, int index, List<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choose the element
        current.add(arr[index]);

        // Explore
        generate(arr, index + 1, current);

        // Undo the choice (BACKTRACK)
        current.remove(current.size() - 1);

        // Don't choose the element
        generate(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        generate(arr, 0, new ArrayList<>());
    }
}
