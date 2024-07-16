public class Palindrome {
    public static void main(String[] args) {
        
        int no = 881;
        int rem, sum = 0,temp=no;
        while (no > 0) {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no = no / 10;

        }
        if (temp == no) {
            System.out.println("this is palindrome Number");
        } else {
        System.out.println("this is not palindroe Number");
    }
    }
}
