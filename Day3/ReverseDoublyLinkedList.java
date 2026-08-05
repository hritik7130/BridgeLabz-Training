package Day3;


import java.util.*;

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev ;

    DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public void insertNode(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }

        tail = node;
    }
}

class Result {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode current = head;
        DoublyLinkedListNode temp = null;

        while (current != null) {

        
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

   
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}

public class ReverseDoublyLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            DoublyLinkedList list = new DoublyLinkedList();

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                list.insertNode(sc.nextInt());
            }

            DoublyLinkedListNode result = Result.reverse(list.head);

            while (result != null) {
                System.out.print(result.data + " ");
                result = result.next;
            }

            System.out.println();
        }

        sc.close();
    }
}