package Day2;

import java.util.*;



class MyQueue<T> {

    private Stack<T> newest = new Stack<>();
    private Stack<T> oldest = new Stack<>();


    public void enqueue(T value) {
        newest.push(value);
    }

 
    public void dequeue() {
        shiftStacks();
        oldest.pop();
    }

 
    public T peek() {
        shiftStacks();
        return oldest.peek();
    }

    private void shiftStacks() {
        if (oldest.isEmpty()) {
            while (!newest.isEmpty()) {
                oldest.push(newest.pop());
            }
        }
    }
}

public class TaleStack {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();

            if (operation == 1) { 
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { 
                queue.dequeue();
            } else if (operation == 3) { 
                System.out.println(queue.peek());
            }
        }

        scan.close();
    }
}
