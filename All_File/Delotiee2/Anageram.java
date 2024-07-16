import java.util.Arrays;

public class Anageram {
    public static void main(String[] args) {
        
        String str1 = "santu";
        String str2 = "tausp";

        char ch[] = str1.toCharArray();
        char ch1[] = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        
        boolean result = Arrays.equals(ch, ch1);

        if (str1.length() != str2.length()) {
            System.out.println("this is not Anagram");
        } else {
            if (result) {
                System.out.println("This is Anagram");
            } else {
                System.out.println("This is not Anagram");
            }

        }

    }
}
