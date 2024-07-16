public class panagram {
    public static boolean isPanagram(String str) {
        if (str.length() < 26) {
            return false;
        } else {
        
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (str.indexOf(ch) < 0) {
                    return false;
                }
            }
       }
       

        return true;
    }
    
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxzzz  mkdir ";
        
       boolean result= isPanagram(str.toLowerCase());
       System.out.println(result);
       if (result == true) {
            System.out.println("This Pangargram");
        } else {
            System.out.println("This is Not Panagram");
        }
    }
}
