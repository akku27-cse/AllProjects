// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      //int no=1024;
      int no=8;
      int a=0,b=1;
      int c=0;
      System.out.print(a+",");
      System.out.print(b+",");
      for(int i=1;i<no;i++){
             c=a+b;
          System.out.print(c+",");
          a=b;
          b=c;
      }
      
      while(no>c){
          c=a+b;
          System.out.print(c+",");
          a=b;
          b=c;
      }
      if(no==c){
          System.out.println(" this is Fibonacci year");
          
      }
         System.out.println(c+"is the next Fibonacci year");
    }
}