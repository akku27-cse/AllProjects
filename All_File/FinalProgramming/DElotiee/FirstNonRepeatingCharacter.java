public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char ch;
        int j;
        String str = "saantu";
        for (int i = 0; i < str.length(); i++) {
            for (j=0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    ch = str.charAt(j);
                    System.out.println(ch);
                }
                
            }
            
        }
    }
}
