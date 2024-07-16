public class H_pattern {
    

    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 4 || i == 3 ) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
