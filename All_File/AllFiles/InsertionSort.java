public class InsertionSort {
    

    public static void main(String[] args) {
        
        int[] arr = { 9, 4, 5, 1, 6, 3 };
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[i] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
