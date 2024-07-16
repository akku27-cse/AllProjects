public class DoublyLinkList {
    public static Node head;
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }



    //Insert At First
    static void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    //Insert At Last
    static void insertAtLAst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        newNode.prev = curr;
        curr.next = newNode;

    }

    //delete at first
    
    


    //print Doubly LInked List

    static void printLinkedList() {
        if (head == null) {
            System.out.println("Enmpty Linked List");
            // head = newNode;
            return;

        }
        Node curr = head;
        System.out.print("null");
        while (curr != null) {
            System.out.print("<-"+curr.data + "->");
            curr = curr.next;

        }
        System.out.print("null");
        
        
    }
        public static void main(String[] args) {
            DoublyLinkList dl = new DoublyLinkList();
            dl.AddFirst(9);
            dl.insertAtLAst(78);
            dl.AddFirst(89);
            dl.insertAtLAst(12);
            dl.printLinkedList();
        }
    
}
