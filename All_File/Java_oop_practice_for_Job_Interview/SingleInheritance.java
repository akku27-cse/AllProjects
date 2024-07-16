public class SingleInheritance {
public static void main(String[] args) {
    

    SecondInh se=new SecondInh();
    se.sub();
    se.sum();
}
}

//def->In single inheritences use two class   which one inhert an another
class firstInh{
    void sum(){
        int x=9;
        int y=8;
        int z=x+y;
        System.out.println(z);

    }
}
class SecondInh extends firstInh{
    void sub(){
        int x=0;
        int y=8;
        int z=x-y;
        System.out.println(z);
    }
}