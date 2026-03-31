import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }

        if (s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s2.pop();
    }
}
