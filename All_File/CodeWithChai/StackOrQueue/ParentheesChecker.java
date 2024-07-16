import java.util.*;;
public class ParentheesChecker {
    

    public static boolean isBalenced(String str) {
        int i = -1;
        char[] stack = new char[str.length()];
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else if(i>=0 && (stack[i]=='(' && ch==')')||(stack[i]=='{' && ch=='}')||(stack[i]=='[' && ch==']'))
                    i--;
            
            else  
            return false;
        }

        return i == -1;
    }


    public static void main(String[] args) {
        String str = "[{()}]";
        if (isBalenced(str)) {
            System.out.println("Balenced");
        }
        else {
            System.out.println("Not BAlenced");
        }
    }
    

}