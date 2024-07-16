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

    public static void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode = head;
            return;
        }
        
            newNode.next=head;
            head = newNode;
        

    }

    public static void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        newNode.next = null;
        if (head == null) {
            newNode = head;
            return;
        }

        while (currNode != null) {
            currNode = currNode.next;
            currNode.next = newNode;
        }

    }

    public static void insertAtSpecific(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode = head;
            return;
        }
        int pos = 3;
        Node currNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    public static void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node currNode = head.next;
        Node prevNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void print() {
       //   Node currNode = head;
        
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
                Node currNode = head;
        while (currNode!= null) {
            
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(4);
        list.insertAtFirst(8);
        list.insertAtLast(9);
        list.print();
    }
}
