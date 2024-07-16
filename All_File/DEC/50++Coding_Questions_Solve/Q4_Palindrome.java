import java.util.Scanner;

public class Q4_Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();
        int rem, count = 0, temp=no;

      //  int temp = no;
      while (no > 0) {
          rem = no % 10;
          count = (count * 10) + rem;
          no /= 10;
      }
      if (count == temp) {
            System.out.println("this is palindrome Number");
        } else {
            System.out.println("This is No Palindrome ");
        }
    }
}
/*output
Enter the Number
 * 151
this is palindrome Number
PS E:\DEC\50++Coding_Questions_Solve> java Q4_Palindrome      
Enter the Number:
112
This is No Palindrome
 */