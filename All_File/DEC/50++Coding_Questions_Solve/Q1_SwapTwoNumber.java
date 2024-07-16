import java.util.*;

class Q1_SwapTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value OF A");
        int A = sc.nextInt();
        System.out.println("Enter value of B");
        int B = sc.nextInt();
        System.out.println("Before Swapping" + "A=" + A + "b=" + B);
        int temp;
        temp=A;
        A = B;
        B = temp;
        System.out.println("After Swaping two Number "+"A="+A+"B="+B);
    
    }
}
/*output
Enter the value of A
10
 * Enter value of B
12
Before SwappingA=10b=12
After Swaping two Number A=12B=10
 */