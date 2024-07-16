import java.util.*;
public class Anagramcheck {
    
    public static void main(String[] args) {
        
        String str = "sil";
        String str2 = "lis  ";
        char ch1[] = str.toCharArray();
        char ch2[] = str2.toCharArray();
         Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean re = Arrays.equals(ch1, ch2);
        if (re) {
    System.out.println("anagram");
} else {
    System.out.println("not anagram");
}
       

    }
}
