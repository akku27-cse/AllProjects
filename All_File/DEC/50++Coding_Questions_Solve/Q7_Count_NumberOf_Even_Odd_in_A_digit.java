import java.util.Scanner;

public class Q7_Count_NumberOf_Even_Odd_in_A_digit {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();
        int rem;
        int even = 0;
        int odd = 0;
        while (no > 0) {
            rem = no % 10;
            if (rem % 2 == 0) {
                even++;
            } else
                odd++;

            no /= 10;

        }
        System.out.println("Total Even Number =" + even);
        System.out.println("Total Odd Number="+odd);
        }
       // System.out.println("Total Number of Digit in this  number ="+count);
    }
    

