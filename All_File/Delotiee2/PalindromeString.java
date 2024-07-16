public class PalindromeString {
    
    public static void main(String[] args) {
        

        String str = "SaaS";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
           
            str2 =str.charAt(i)+str2 ;
        }
        if (!str.equals(str2)) {
            System.out.println("not");
        } else {
            System.out.println("pali");
        }
      
    }
}
