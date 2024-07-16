import java.util.Scanner;

public class Q8_SumOfDigit {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();
        int rem;
        int sum = 0;

        while (no > 0) {
            rem = no % 10;
            sum = sum + rem;
            no /= 10;

        }
        System.out.println("Sum of digit of a Number ="+sum);
   } 
}
/*output
 * PS E:\DEC\50++Coding_Questions_Solve> java Q8_SumOfDigit
Enter the Number:
78
Sum of digit of a Number =15 
 */