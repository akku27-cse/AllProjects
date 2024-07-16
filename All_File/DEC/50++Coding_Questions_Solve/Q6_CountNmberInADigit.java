import java.util.Scanner;

public class Q6_CountNmberInADigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();

        int count = 0;
        while (no > 0) {
            count++;
            no /= 10;
        }
        System.out.println("Total Number of Digit in this  number ="+count);
    }
}
/*output
 * Enter the Number:
7899
4
 */
