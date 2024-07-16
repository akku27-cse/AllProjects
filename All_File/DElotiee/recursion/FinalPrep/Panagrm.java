public class Panagrm {
    
    public static void main(String[] args) {
        
        String str = "Abcdefghijklmnopqrstuvwxy";
        str.toLowerCase();
        int count = 0;
        if (str.length() < 26) {
            count++;
  
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) < 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println("Panagram");
            } else {
                System.out.println("Not Panagram");
            }
        }
    }
}
