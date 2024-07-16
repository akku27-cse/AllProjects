import java.util.Scanner;

public class Q3_ReverseString {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        System.out.println(s);
        
        char ch;
        //reverse a string
        String t = s;
        for (int i = s.length()-1; i >= 0; --i) {
            System.out.print(s.charAt(i));
            ch = s.charAt(i);
            
        }
       
    }
}
