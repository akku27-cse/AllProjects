public class ReverseArray {
    
    public static void main(String[] args) {
        
        String str3 = "";
        String str[] = { "Hello hii" };
        for (int i = 0; i < str.length; i++) {
            String str2 = str[i];
            for (int j = 0; j < str2.length(); j++) {
                char ch = str2.charAt(j);
                str3 = ch + str3;

            }

        }
        System.out.println(str3);
    }
}
