//   this is also call function overloading
public class PolyMor_practice {
    public static void main(String[] args) {
        Poly p1=new Poly();
        p1.p();
         p1.p(78);
        
    }
}

// def-> it means one name many from that is call polymorphisum

//run time poly morphisum:-> same name different data type is call function over loading
class Poly{
    int a=9;
    int b=9;
    //explain polymorphisum

    void p(){
        System.out.println("This is first poly morphisum output");

    } 

    void p(int y){

        System.out.println(y);

    }

}