public class FibonacciSerise {
    public static void Fibo(int a, int b, int no) {

        if (no == 0) {
            return;
        }
        System.out.println(a);
        Fibo(b, a+b, no-1);

        
        
    }
    public static void main(String[] args) {
        int no = 8, a = 0, b = 1;
         Fibo(a,b, no);
    }
}
