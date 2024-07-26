// // public class Encapsulation {
// //     public static void main(String[] args) {
// //         S s=new S();
// //       // result = s.getValue(30);
// //        s.setValue(90);
// //        System.out.println(s.getValue());
// //        B b=new B();
// //     }
// // }
// // final class B{

// //     @Override
// //     public String toString() {
// //         return "B []";
// //     }
// // System.out.println("k");
// // }
// // class S implements B{
// //    private   int x;
// //     void show(){
// //         System.out.println(x);
// //     }
// //    public int getValue(){
// //         return x;
// //     }
// //     void setValue(int x){
// //         this.x=x;
// //     }
   
// // }


// /**
//  * Encapsulation
//  */
// public class Encapsulation {
// public static void add() throws ArithmeticException{
//    // throw new ArithmeticException("This code can create some exception");
// }
//     public static void main(String[] args) {
//         System.out.println("santu");
//         try{
//         int x=9/0;
//         }catch(ArithmeticException e){
//             System.out.println(e);
//         }
//     add();
       
//         System.out.println("java");
//     }
// }


/**
 * Encapsulation
 */
public class Encapsulation {

public static void ad() throws ArithmeticException{
    int x=5/0;
}

    public static void main(String[] args) {
        System.out.println("santu");
        try{
        ad();
        }catch(ArithmeticException e){System.out.println(e);}
        System.out.println("java");
    }
}