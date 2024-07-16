public class AbstructClass {
    public static void main(String[] args) {
       easy s=new easy();
       s.run(5); 
    }
}


//def->we can not create insace ob an object in abstract class

abstract class FirstAb{
    abstract void run(int x);
 
}
class easy extends FirstAb{
    public void run(int x){
        System.out.println(x);
    }
}

