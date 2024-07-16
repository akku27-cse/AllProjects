public class Q10_FibonacciSerise {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int no = 8;

        int c;
        System.out.print(a+","+b);
        for(int i=2;i<  no;i++){
            c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;
        }
    }
}
