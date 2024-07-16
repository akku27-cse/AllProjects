public class StackP {
    
//    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackPractice {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = haed.data;
        head = head.next;
        return top;

    }

    public static void peak() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
    
    
    public static void main(String[] args) {
        StackP s = new StackP();
        s.push(4);
        s.push(5);
        s.pop();
        s.pop();
        s.peak();     
  
    }
}
  