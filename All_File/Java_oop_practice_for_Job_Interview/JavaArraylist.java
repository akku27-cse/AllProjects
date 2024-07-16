
import java.util.*;
public class JavaArraylist {
    public static void main(String[] args) {
        //call arrar list c lass
        ArrayList<String> car=new ArrayList<String>();
     // call add method
     car.add("bus");
     car.add("train");
     car.add("voolvo");
     System.out.println(car);
     //acess in an item of an array list
     System.out.println(car.get(0));

     //change an item
     car.set(0,"bus2");
     System.out.println(car);
     //remove an item

     System.out.println(car.remove(0));
     //clar all element
    //  car.clear();
    //  System.out.println(car);

    // find the array list size
    car.size();
    System.out.println(car);

    for(int i=0;i<car.size();i++){
        System.out.println(car.get(i));
    }
    }
}
