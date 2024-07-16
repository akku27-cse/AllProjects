public class StringSole {
    public static void main(String[] args) {
        
        String str = "santu";
        String str2 = "akash";
        String str3 = "deya";
        char ch;
        char ch2;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
                ch = '%';
            }
            System.out.print(ch);
        }
      System.out.println();
      
      for (int i = 0; i < str2.length(); i++) {
          ch2 = str2.charAt(i);
          if (ch2 == 'b' || ch2 == 'c' || ch2 == 'k' || ch2 == 'f' || ch2 == 's' || ch2 == 'h') {
              ch2 = '#';
          }
          System.out.print(ch2);
      }

      
      str3.toUpperCase();
      System.out.println(ch+ch2 );
    }
}
