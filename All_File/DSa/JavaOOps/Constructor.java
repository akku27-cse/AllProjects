/*Constuctor=>Counstroctor is a special method which is same name as class ,when a class instance is created at that time counstructor automatic invoked
 * it is 3 types ->1.default Constructor()=>
 * 2.parametresized constructor()=>
 * 3.copy Constructor()
 * 
 * 
 */



class ConstructorP {
    int x = 89;

    ConstructorP() {
        int y = 90;
        int z = this.x + y;
        System.out.println(z);
    }

    void show(int x, int y) {
        System.out.println(x+y);
    }



}


public class Constructor {
    public static void main(String[] args) {
        ConstructorP c = new ConstructorP();//if there is no parameter is present at that time its uis call deafult constructor.
        ConstructorP c1 = c;
        c1.show(58, 78);
    }
}
