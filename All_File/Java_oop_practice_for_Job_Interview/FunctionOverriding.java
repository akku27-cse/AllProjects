public class FunctionOverriding {
    public static void main(String[] args) {
     fuunctionOver f1=new Function2();
        f1.Sum(5, 4);
    }
}
//def--> same name and same parameter which is inherit each other is call ovverriding
class fuunctionOver{
 void Sum(int x,int y){
int z=x+y;
System.out.println(z);
 }
}
class Function2 extends fuunctionOver{
    void Sum(int x,int y){
        int z=x-y;
        System.out.println(z);
    }
}