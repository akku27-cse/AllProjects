public class DoublyLinkList {
    

    Node head;

    public static class Node {
        Node prv;
        String data;
        Node next;

        Node(String data) {
            this.prv = null;
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.prv = null;
            head = newNode;
        }
        newNode.next = head;
        head.prv = newNode;
        head = newNode;

    }

    public void addEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.prv = null;
            head = newNode;
        }

        Node CuurNode = head;
        while (CuurNode.next != null) {
            CuurNode = CuurNode.next;
        }
        CuurNode.next = newNode;
        newNode.prv = CuurNode;

    }
    //print
    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("Null");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;

        }
        //for one node
        Node temp = head;
        if (temp.prv == temp.next) {
            head = null;
            return;
        } else {
            head = head.next;
            head.prv = null;
        }
    }

    public void deleteLast() {
            if (head == null) {
            System.out.println("list is empty");
            return;

        }
        //for one node
        Node temp = head;
        if (temp.prv == temp.next) {
            head = null;
            return;
        }
        

        Node temp1 = head;
        Node temp2 = head.next;
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        temp2.prv = null;
        temp1.next = null;
 }


    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList();
        list.addFirst("santu");
        list.addEnd("is");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();

    }
}
 