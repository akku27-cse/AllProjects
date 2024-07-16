public class FindVowel{
     public static void main(String[] args) {
    
         String str = "SANTU";
         char ch = ' ';
         char ch2=' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                //ch2 = ch;
                System.out.println(ch);   
            }
           // System.out.println(ch2);
        }

    }
}