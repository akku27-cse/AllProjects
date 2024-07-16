public class MultilevelInheritances {
    public static void main(String[] args) {
    c c1=new c();
    c1.p();
    c1.p2();  
    }
}


//def->  one child class inherit two parent classs

class A{
    void p(){
         System.out.println("this is first paraentr ");
    }
}
class B  extends A{
    void p2(){
        System.out.println("this is second parent class");
    }
}

class c extends B{

}