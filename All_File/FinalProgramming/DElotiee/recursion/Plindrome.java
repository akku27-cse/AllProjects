public class Plindrome {
    public static int isPalindrome(int n,int temp) {
        if (n == 0) {
            return temp;
    }
        
        temp = (temp * 10) + (n % 10);



        return isPalindrome(n/10,temp);
    }
    public static void main(String[] args) {
        int n = 151;
        int temp = isPalindrome(n, 0);
        if (temp == n) {
            System.out.println("palindrome");
        } else
    System.out.println("not palindrome");

    }
}
