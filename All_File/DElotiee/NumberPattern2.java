public class NumberPattern2 {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; --j) {

                System.out.print(j);
              //  n = n - 2;

            }
            
            System.out.println();
            n = n - 2;
        }

    }
}