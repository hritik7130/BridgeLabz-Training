package Day9;


import java.util.*;

public class QueueUsingTwoStacks {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    // Enqueue
    static void enqueue(int x) {
        stack1.push(x);
    }

    // Move elements from stack1 to stack2
    static void transfer() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    // Dequeue
    static void dequeue() {
        transfer();
        stack2.pop();
    }

    // Peek front
    static int peek() {
        transfer();
        return stack2.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int type = sc.nextInt();

            if (type == 1) {
                int x = sc.nextInt();
                enqueue(x);
            }
            else if (type == 2) {
                dequeue();
            }
            else if (type == 3) {
                System.out.println(peek());
            }
        }

        sc.close();
    }
}
