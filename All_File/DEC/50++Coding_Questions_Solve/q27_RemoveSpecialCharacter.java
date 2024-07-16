public class q27_RemoveSpecialCharacter {
    


    public static void main(String[] args) {
        String s="sdjfkwe$#%$sbdfsfh567687";
        String result = " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) <= 122) {
                result = result + s.charAt(i);
            }
        }

System.out.print("After remove Special Character from this String="+result);

    }
}
