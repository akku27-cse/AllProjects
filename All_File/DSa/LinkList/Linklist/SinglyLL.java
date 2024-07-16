public class SinglyLL {
  
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // add First
    public static void Add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        }
    }

    // ADD specific
    public static void addPosition(int data) {
        System.out.println("after Add positon");
        int pos = 2;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node cuuNode = head;
        Node temp = head.next;

        for (int i = 0; i < pos - 1; i++) {
            cuuNode = cuuNode.next;
        }
        newNode.next = cuuNode.next;
        cuuNode.next = newNode;
    }

    // delete first
    public static void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // delete last
    public static void deleteLast() {
        System.out.println("after delete Last");
        if (head == null) {
            System.out.println("List is Empty");
            return;

        }
        if (head.next == null) {
            head = null;
            return;

        }
        Node currNode = head;
        Node temp = head.next;
        while (temp.next != null) {
            currNode = currNode.next;
            temp = temp.next;

        }
        currNode.next = null;

    }

    // delete at position
    public static void deletePostion() {
        System.out.println("after delete Position");
        int pos = 3;
        if (head == null) {
            System.out.println("List is Empty");
            return;

        }
        if (head.next == null) {
            head = null;
            return;

        }
        Node currNode = head;
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            currNode = currNode.next;
            // temp=temp.next;
        }

        currNode.next = currNode.next.next;
    }

    // delte at pos from back
    public static void deleteFromBAck() {
        int count = 0;
        int pos = 2;
        int finalpos;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println("length of the link list="+count);
        Node temp = head;
        Node temp2 = null;
        int flag = 0;
        finalpos = count - pos+1;
        for (int i = 1; i < finalpos; i++) {
            if (temp.next != null) {
                temp2 = temp;
                temp = temp.next;

            } else {
                flag++;
                break;
            }

        }
        if (flag == 0) {
            temp2.next = temp.next; 
        }
        
    }

    // reverse
    public static void Reverse() {
        System.out.println("after reverse..");
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;

            // reverse
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // add two Number;
    public static void AddTwoNode() {
        Node curr = head;
        int sum = 0;
        while (curr != null) {
            sum = sum + curr.data;
            curr = curr.next;

        }
        System.out.println("sum of Linked ilst =" + sum);
    }

    // find Middle of LinkList
    public static void FindMiddle() {
        int count = 0;
        int mid;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        Node temp = head;
        mid = count / 2;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        System.out.println("Middle value is =" + temp.data);
    }



    //Sort LinkList


    public static void Sort() {
        
          
    }


    //FINd  loop


    public static void findLoop(Node head) {

        if (head == null) {
            System.out.println("no Loop is present");
            return;
        }
        if (head.next == null) {
            System.out.println("there is is one node so no loop is present");
            return;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next.next;

            if (slow == fast) {
                System.out.println("Loop is present");
            }

        }
        
    }
    
    //detect first node in loop
    public static void detectFirstNode() {
        Node meet = head;//findLoop(head);
        Node start = head;

        while (start.next != meet.next) {
            start = start.next;
            meet = meet.next;
        }
        meet.next=null;
    }
    //find Length of loop

    public static void FindLength() {
        int count = 0;
        Node First = head;
        Node slow = head;
        while (slow != null && slow.next != null) {
            slow = slow.next;
            First = First.next;

            if (slow == First) {
                System.out.println("finn Loop");
            }
            while (First != slow) {
                count++;
                First = First.next;

            }
            System.out.println(count);

        }
    }

    public static void length(Node First, Node slow) {
    
        int count = 1;
        while (First != slow) {
            count++;
            First = First.next;

        }
    System.out.println(count);

    }

    // print
    public static void print() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLL ll = new SinglyLL();
        ll.Add(7);
        ll.Add(9);
        ll.addLast(10);
        ll.addLast(89);
        ll.addLast(65);
        ll.addLast(78);
       ll.print();
        ll.deleteFromBAck();
       ll.print();
       
        // ll.FindMiddle();
        
        // ll.print();
        // ll.Reverse();
        // ll.print();
        // ll.AddTwoNode();
        // ll.deleteFirst();
        // ll.print();
        // ll.addLast(15);
        // ll.addPosition(14);
        // ll.print();

        // ll.deleteLast();
        // ll.print();
        // ll.Add(989);
        // ll.Add(78);
        // ll.Add(321);
        // // ll.deletePostion();
        // ll.print();
        // ll.addLast(89);
        // ll.addLast(655);
        // ll.addLast(7878878);

        // ll.FindMiddle();

    }

}