import java.util.Scanner;

public class Q9_FindLargestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int first = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int Second = sc.nextInt();
        System.out.println("Enter the Third Number:");
        int Third = sc.nextInt();

        if (first > Second && first > Third) {
            System.out.println(first+"is the largest number");
            
        } else if (Second > first && Second > Third) {
            System.out.println(Second+"is the largest Number");
        } else {
            System.out.println(Third+"is the largerst number");
        }

    }
}
