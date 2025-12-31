class TaskScheduler {

    class Node {
        int id, priority;
        String name, dueDate;
        Node next;

        Node(int i, String n, int p, String d) {
            id = i;
            name = n;
            priority = p;
            dueDate = d;
        }
    }

    Node head;

    void addTask(int id, String name, int priority, String due) {
        Node newNode = new Node(id, name, priority, due);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    void displayTasks() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.println(temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}
