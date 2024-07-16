public class Q31_FibonacciSeriseorNot {
    

    public static void main(String[] args) {
        int no =2024;

        int a = 0, b = 1;
        int c = 0;
          
          while (c < no) {
              c = a + b;
              a = b;
              b = c;
              //c = a + b;
          }
       
          if (c == no) {
              System.out.println("This year is previous year");
          } else {
            System.out.println("this is not fibonassi year");
          }
        System.out.println("Next Fibonacci year="+c);
    }
}
