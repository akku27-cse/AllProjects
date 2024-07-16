package Two_D_Array;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int[][] number = new int[row][col];



     //row chose
     for (int i = 0; i < row; i++) {
         //column
         for (int j = 0; j < col; j++) {
             number[i][j] = sc.nextInt();

         }
     }
     System.out.println("Matrix is");
     //print 
     for (int i = 0; i < row; i++) {
         //column
         for (int j = 0; j < col; j++) {
             // number[i][j] = sc.nextInt();
             System.out.print(number[i][j] + " ");
         }
         System.out.println();
     }
    }
}
/* output
PS E:\DEC\Array_practice> java TwoDArray      
3--> row
3-->colmn
1 2 3->> first row
4 5 6-->second row
7 8 9-->thord row
Matrix is
1 2 3 
4 5 6
7 8 9
 */