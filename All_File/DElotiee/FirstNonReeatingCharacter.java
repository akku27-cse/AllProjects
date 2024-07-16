public class FirstNonReeatingCharacter {
    public static void main(String[] args) {
        int i;
       char ch=' ';
        String str = "ssaant";
        for (i = 0; i < str.length(); i++) {
            boolean boll = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    boll = true;
  
                }
            }
           
            if (boll) {

                ch = str.charAt(i);
            
            }
            System.out.println(ch);
        }
        
    }
}
