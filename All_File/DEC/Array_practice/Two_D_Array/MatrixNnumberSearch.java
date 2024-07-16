package Two_D_Array;
import java.util.Scanner;

public class MatrixNnumberSearch {
    
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
     System.out.println("Enter the Number  which are find");
     int target = sc.nextInt();
     int count = 0;

 for (int i = 0; i < row; i++) {
         //column
         for (int j = 0; j < col; j++) {
             // number[i][j] = sc.nextInt();
             //System.out.print(number[i][j] + " ");
             if (target == number[i][j]) {
                 count++;
             }
         }
         //System.out.println();
     }
        if(count==1){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }
}


/*output
 * 
 * 
 * PS E:\DEC\Array_practice> java MatrixNnumberSearch      
3
3
1 2 3
7 8 9
3 2 1
Matrix is
1 2 3
7 8 9
3 2 1
Enter the Number  which are find
5
not found
 */