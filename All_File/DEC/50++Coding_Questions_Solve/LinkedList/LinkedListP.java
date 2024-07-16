class LinkedListP{
     static Node head;

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }
    
    public  void AddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void AddEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    public void addSpeciic(String data) {
        int pos = 3, i = 0;
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }
        Node temp = head;
        for (i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    
    //PRINT
    public void printList() {

        if (head == null) {vb 
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
        }
        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;

        }



        Node temp1 = head;
        Node temp2 = head.next;
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }

    public static void main(String[] args) {
        LinkedListP list = new LinkedListP();
        list.AddFirst("a");
        list.AddFirst("is");
        list.printList();
        list.deleteFirst();
        list.deleteLast(); 
    }
}