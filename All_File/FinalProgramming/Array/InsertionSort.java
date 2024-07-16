public class InsertionSort {
public static void main(String[] args) {
    
    int[] arr = { 1, 3, 2, 9, 7, 4 };
    int temp;
    for (int i = 1; i < arr.length; i++) {
        temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
     for(int i=0;i<arr.length;i++)
     System.out.println(arr[i  ]);
}
}
