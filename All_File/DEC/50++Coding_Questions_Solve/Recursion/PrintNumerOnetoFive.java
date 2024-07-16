import java.util.Scanner;

public class PrintNumerOnetoFive {

    public static void Print(int no,int stop) {
        if (no == stop)
            System.out.print(stop+",");; 

System.out.print(no);
        Print(no+1,stop);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int stop = sc.nextInt();
         Print(no,stop);
    }
}
