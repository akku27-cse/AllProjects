/**
 * Palindrome
 */
public class Palindrome {

    
    public static void main(String[] args) {
        
        int no = 989;
        int temp = no;
        int rem, sum = 0;
        while (no > 0) {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no /= 10;
        }
        if (sum==temp) {
            System.err.println("this is palindrome Number");
        } else {
            System.out.println("This is Not Plaindrome Number+");
        }
    }
}