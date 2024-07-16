public class FiboncissiSerise {
    public static void main(String[] args) {
        
        int a = 0, b = 1;
        int no = 8;
     int c =a+b;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 1; i < no; i++) {


            System.out.print(c + ",");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
