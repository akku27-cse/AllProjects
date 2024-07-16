public class PrintSPattern {
    
    public static void main(String[] args) {
        int n = 5, m = 4;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == 3 || i == 5 | (i == 2 && j == 1) || (i == 4 && j == 4)) {
                    System.out.print("* ");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
