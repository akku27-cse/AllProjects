public class Q28_CountWordInaString {
    public static void main(String[] args) {
        String s = "my name is santu     jana";
        int result=1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1)!= ' ')) {
                result++;                
            }
        }

        System.out.print("Total Number of word=" + result);
    }
}