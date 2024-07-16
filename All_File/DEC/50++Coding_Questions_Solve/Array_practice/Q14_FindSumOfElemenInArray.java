import java.util.Scanner;

public class Q14_FindSumOfElemenInArray{
    public static void sumOfElement(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
    System.out.println("Total sum of element of an array ="+sum);
}

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of Array");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the value");
        for(int i=0;i<no;i++)
            arr[i] = sc.nextInt();

            sumOfElement(arr);

    }
}