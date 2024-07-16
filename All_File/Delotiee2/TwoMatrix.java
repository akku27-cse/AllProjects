public class TwoMatrix {
    
    public static void main(String[] args) {

        int mtrx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int mtrx2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result[][] = new int[3][3];
        for (int i = 0; i < mtrx1.length; i++) {
            for (int j = 0; j < mtrx2.length; j++) {
                result[i][j] = mtrx1[i][j] + mtrx2[i][j];
                System.out.print(result[i][j]+"");
            }System.out.println();
            }//System.out.println();
        }
        
        

}
