import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str2 = ch + str2;

        }
        //check Plaindrome
        if (str.equals(str2)) {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    
    }
}