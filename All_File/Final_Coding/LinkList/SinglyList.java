public class SinglyList{
    public static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }
    
    public static void InsertAtBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    //Insert AT last
    public static void InserATLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }
    //Insert At specific
    public static void InsertAPos(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        Node nextNode = head;
        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;

        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    //deelte  at  fist 
    public static void DeleteAtFirst() {
        if (head == null) {
            System.out.println("List is Emptyh");
            return;
        }
        head = head.next;
    }
    //delete At Last
    public static void DelteAtLast() {
        if (head == null) {
            System.out.println("List is Epty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head.next;
        Node NextNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            NextNode = NextNode.next;
        }
        NextNode.next = null;
    }

    public static void DeleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is Epty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head.next;
        Node NextNode = head;
        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;
            NextNode = NextNode.next;

        }

        NextNode.next = currNode.next;
    }

    //reverse

    public static void Reverse() {
        Node currNode = head.next;
        Node preNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
     
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    public static void AddTwoNumber() {
        int sum = 0;
    }
    
    //find the middle
    public static void FindTheMiddle() {
        if (head == null) {
            System.out.println("list is Empty");
            return;
        }
        if (head.next == null) {
            System.out.println("there is one node in this Link List");
            return;
}


        Node currNode = head;

        int count=0;
        while (currNode != null) {
            count++;
            currNode = currNode.next;

        }
        System.out.println("the lengght of this Link list =" + count);
        int middle = (count + 0) / 2;
        for (int i = 1; i < middle ; i++) {
            currNode = currNode.next;
        }
        System.out.println("middle of thr data ="+currNode.data);
}


    //print

public static void Print() {
    if (head == null) {
        System.out.println("List is Empty");
        return;

    }
    Node currNode = head;
    while (currNode != null) {
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
    }
    System.out.println("null");
}
    

    public static void main(String[] args) {
        SinglyList s = new SinglyList();
        s.InsertAtBeg(7);
        s.InsertAtBeg(9);
        s.InserATLast(78);
        s.InserATLast(14);
        // s.InsertAPos(25, 2);
        s.Print();

       
    //     s.DeleteAtFirst();
    //    s.DelteAtLast();
    // s.DeleteAtPos(2 );
    System.out.println("After Reverse");
    //  s.Reverse();
    System.out.println("after add fnd the Middle Numbers");
   s.FindTheMiddle();
   s.Print();
        
    }
}