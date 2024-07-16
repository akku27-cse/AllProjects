import java.util.*;
public class searh {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<Integer>();
        s.add(4);
        s.add(5);
        s.add(6);
        int s2=5,count=0;
        for(int i=0;i<s.size();i++){  
            if(s.get(i)==s2){
                count++;
            }
        }
        if(count==1){
            System.out.println("found");

        }
        else{
            System.out.println("not found");
        }

    }
}
