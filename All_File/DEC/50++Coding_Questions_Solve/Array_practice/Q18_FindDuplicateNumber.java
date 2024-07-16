import java.util.Scanner;

public class Q18_FindDuplicateNumber {

    public static void DuplicateNumber(int arr[]) {
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
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate vaue is" + "," + arr[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("no duplicate value are present");
        }
        
    }
    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        System.out.println("enter size of First Array");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the value");
        for(int i=0;i<no;i++)
            arr[i] = sc.nextInt();
            DuplicateNumber(arr);
    }
}
