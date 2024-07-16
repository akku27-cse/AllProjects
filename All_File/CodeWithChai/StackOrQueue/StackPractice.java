public class StackPractice {

    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static class Stack {
        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {

            if (isEmpty()) {

                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public static int peak() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    
    
    public static void main(String[] args) {
     Stack s=new Stack();
     s.push(7);
     s.push(8);
     s.push(9);
     while (!s.isEmpty()) {
         System.out.print  (s.peak() + "->");
         s.pop();
     }
     System.out.println("null");
    }

}