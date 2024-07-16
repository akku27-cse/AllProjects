import java.util.Scanner;

/**
 * PrintNumerFivetoOne
 */
public class PrintNumerFivetoOne {

    

    public static void Print(int no) {
        if(no==0)
            return;

        System.out.println(no);
            Print(no-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        Print(no);
    }
}