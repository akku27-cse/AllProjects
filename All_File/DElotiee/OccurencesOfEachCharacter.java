public class OccurencesOfEachCharacter {
    public static void main(String[] args) {
        String str = "sssa";
        //char s, a;
        int s=0,a=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 's') {
                s++;
            } else {
                if (ch == 'a') {
                    a++;
                }
            }
        }
        System.out.println("s is occur=" + s + "times");
        System.out.println("a is occure="+a+"times");
    }
}
