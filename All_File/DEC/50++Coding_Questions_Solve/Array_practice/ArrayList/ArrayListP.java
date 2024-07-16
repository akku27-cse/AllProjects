import java.util.*;

public class ArrayListP {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(9);
        arr.add(3);
       // arr.get(0);
    
        System.out.println(arr);
        //set/modify
        arr.set(0, 8);
        //iterate
        for(int i=0;i<arr.size();i++){
            System.out.print("->"+arr.get(i));
        }
    }
}
