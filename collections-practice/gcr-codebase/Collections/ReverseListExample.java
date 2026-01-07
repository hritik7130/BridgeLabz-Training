import java.util.*;

public class ReverseListExample {

    public static void reverseList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}