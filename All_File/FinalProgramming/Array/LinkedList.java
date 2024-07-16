public class LinkedList {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void InsertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }



    public static void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        
    }

    public static void main(String[] args) {
        

    }
}
