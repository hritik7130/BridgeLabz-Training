package Day2;

import java.util.*;

public class MaximumElement {

    public static List<Integer> getMax(List<String> operations) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for (String operation : operations) {

            String[] parts = operation.split(" ");
            int type = Integer.parseInt(parts[0]);

            if (type == 1) {

                int value = Integer.parseInt(parts[1]);
                stack.push(value);

                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                }

            } else if (type == 2) {

                int removed = stack.pop();

                if (removed == maxStack.peek()) {
                    maxStack.pop();
                }

            } else if (type == 3) {

                result.add(maxStack.peek());

            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> operations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }

        List<Integer> answer = getMax(operations);

        for (int value : answer) {
            System.out.println(value);
        }

        sc.close();
    }
}