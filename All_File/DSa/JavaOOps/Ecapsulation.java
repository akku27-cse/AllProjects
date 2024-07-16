/* Encapsuation:=>{
    The process of combing many element into single Element is call Encapsulation

    it is use to prevent direct asscebility of the data member and member function and this done by access Specifier

} */

class practice {

    private int x = 90;

    private void Display() {
        int x = 9;
        int z = 89;
        System.out.println(x+z);
    }
  
    void show() {
        this.Display();
        System.out.println(this.x);
    }
}
public class Ecapsulation {
public static void main(String[] args) {
    practice p = new practice();

    p.show();
}    
}
