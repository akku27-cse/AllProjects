public class ReverseString {
    public static void main(String[] args) {
        String str = "santu";
        String rev = "";

        String str2 = str;

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        
        System.out.println(rev);
        if (rev.equals(str2)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Plaindrome String");
        }
    }
}
