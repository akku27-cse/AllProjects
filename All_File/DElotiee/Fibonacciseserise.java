public class Fibonacciseserise{


    public static void main(String[] args) {
        
        int a=0,b=1;
        int n = 8, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b=c;
    }
    }
}