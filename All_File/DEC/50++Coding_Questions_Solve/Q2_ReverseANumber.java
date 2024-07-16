import java.util.*;

public class Q2_ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();
        int rem, count = 0, temp;
        while (no > 0) {
            rem = no % 10;
            count = (count * 10) + rem;
            no /= 10;
        }
        System.out.println("Reverse Number is=" + count);
    }
}
/*out put
 * PS E:\DEC\50++Coding_Questions_Solve> java Q2_ReverseANumber
Enter the Number:
45
Reverse Number is=54
 */
