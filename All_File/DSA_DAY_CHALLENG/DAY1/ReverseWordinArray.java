public class ReverseWordinArray {
    public static void main(String[] args) {
        
        String str[] = { "arr", "tuu", "poo" };
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length(); j >= 0; --j) {
                System.out.println(str[j]);
            }
        }
    }
}
