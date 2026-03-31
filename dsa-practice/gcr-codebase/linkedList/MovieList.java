class MovieList {

    class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;

        Node(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    Node head, tail;

    void addAtEnd(String t, String d, int y, double r) {
        Node newNode = new Node(t, d, y, r);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }
}
