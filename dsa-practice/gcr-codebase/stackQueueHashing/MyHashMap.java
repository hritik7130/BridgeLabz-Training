class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    int SIZE = 10;
    Node[] table = new Node[SIZE];

    int hash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
            return;
        }

        Node temp = table[index];
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    int get(int key) {
        int index = hash(key);
        Node temp = table[index];

        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return -1;
    }
}
