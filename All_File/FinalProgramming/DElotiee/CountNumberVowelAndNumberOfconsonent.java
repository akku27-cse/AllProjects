public class CountNumberVowelAndNumberOfconsonent {
    public static void main(String[] args) {
        
        String str = "Hii My Name is Santu Jan  a";
        int vowel = 0, cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                vowel++;
            else {
                cons++;
            }
        }
        System.out.println("Vowel presnt="+vowel+"consonent present="+cons);
    }
}
