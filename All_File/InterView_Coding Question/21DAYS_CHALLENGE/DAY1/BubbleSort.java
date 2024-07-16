public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = { 4, 2, 3, 6, 1, 8, 7, 5 };
        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
