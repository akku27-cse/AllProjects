import java.util.*;

public class Anagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "delotiee";
        String str2 = "eeilodet";


        char ch[] = str.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        boolean boll =Arrays.equals(ch,ch2);
        if (boll==true) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
    }
}
