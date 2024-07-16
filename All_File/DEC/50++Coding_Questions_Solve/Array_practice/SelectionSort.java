import java.util.Scanner;

public class SelectionSort {
    public static void Selection(int arr[]) {
        int temp,pos;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
                if (pos != i) {
                    temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of elelmen:");
        int no = sc.nextInt();
        int[] arr = new int[no];
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        Selection(arr);
    }
}
