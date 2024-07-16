import java.util.Scanner;

public class BuubleSort {
    public static void Bubble(int arr[]) {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The size of elelmen:");
    int no=sc.nextInt();
    int[] arr=new int[no];
    for (int i = 0; i < no; i++) {
        arr[i] = sc.nextInt();
    }
Bubble(arr);
}
}
