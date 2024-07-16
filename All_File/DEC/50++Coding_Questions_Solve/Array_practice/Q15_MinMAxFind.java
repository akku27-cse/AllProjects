import java.util.Scanner;

public class Q15_MinMAxFind {
    public static void findMaxMin(int arr[]) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Min value"+arr[0]);
        System.out.println("max value=" + arr[arr.length-1]);
        //for (int i = arr.length - 1; i >= 0; i++) {
    
    //}
    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter size of First Array");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the value");
        for(int i=0;i<no;i++)
            arr[i] = sc.nextInt();
            findMaxMin(arr);
    }
}
