class Inventory {

    class Node {
        int id, qty;
        String name;
        double price;
        Node next;

        Node(int i, String n, int q, double p) {
            id = i;
            name = n;
            qty = q;
            price = p;
        }
    }

    Node head;

    double totalValue() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}
