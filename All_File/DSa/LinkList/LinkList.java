public class LinkList {

    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    static void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        // System.out.println("Insert at First DOne");
    }

    // insert at last

    static void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        // newNode.next=null;
        curr.next = newNode;
    }

    // Insert at specific
    static void InsertAtPos(int data) {
        int pos = 3;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //delete at First
    static void deleteAtFirst() {
        if (head == null) {
            System.out.println("Linked list is EMpty");
            return;
        }
        if (head.next == null) {
            head = null;
        }
        head = head.next;
    }

    //delete At LAst
    static void deleteAtLast() {
        if (head == null) {
            System.out.println("Linked list is EMpty");
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node temp1 = head;
        Node temp2 = head.next;
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = null;

    }

    //delete a position
    // static void deleteAtPos() {
    //     int pos = 2;

    //     if (head == null) {
    //         System.out.println("Linked list is EMpty");
    //         return;
    //     }
    //     if (head.next == null) {
    //         head = null;
    //     }
    //     Node temp1 = head;
    //     Node temp2 = head.next;
    //     for (int i = 0; i < pos - 1; i++) {
    //         temp1 = temp1.next;
    //     }
    // }

    //reverse LinedList
    static void reverse() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }
    
    // print LinkList
    static void Print() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;

        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.AddFirst(5);
        // ll.AddLast(7);
        ll.AddFirst(1);
        ll.AddFirst(36);
        ll.AddLast(89);
        ll.InsertAtPos(9);
        ll.deleteAtFirst();
        ll.deleteAtLast();
        ll.Print();
        System.out.println(" ");
        System.out.println("after Reverse");
        ll.reverse();
        ll.Print();
    }

}