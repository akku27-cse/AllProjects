//package recursion;

public class fact {
    
    public static int fac(int n) {

        int result = 0;
        
        if (n == 1) {
            return 1;
        } else {
            
          return( n * fac(n - 1));
        }

    
}
    public static void main(String[] args) {
        int n = 5;
       int result= fac(n);
        System.out.println(result);
    }
}
