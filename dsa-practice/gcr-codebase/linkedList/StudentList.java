class StudentList {

    class Node {
        int rollNo, age;
        String name, grade;
        Node next;

        Node(int r, String n, int a, String g) {
            rollNo = r;
            name = n;
            age = a;
            grade = g;
            next = null;
        }
    }

    Node head;

    void addAtBeginning(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.rollNo == roll) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.rollNo != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void search(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student Not Found");
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }
}
