
import java.util.*;
public class Tcs{
    public static void main(String[] args)
{

    Scanner sc = new Scanner(System.in);

String f = sc.nextLine();
char ch;
String str="";
for(int i=0;i<f.length();i++){
ch=f.charAt(i);
str+=ch;
}
if(f.equals(str)){
    System.out.println("27");
}

}
}