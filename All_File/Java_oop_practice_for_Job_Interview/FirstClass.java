//sum 
class First{
    int x=9;
    int y=9;
    int z=x+y;
    void dispaly(){
        System.out.println(z);
    }
}
class FirstClass{
    public static void main(String a[]){
        First f1=new First();
        f1.dispaly();
    }
}