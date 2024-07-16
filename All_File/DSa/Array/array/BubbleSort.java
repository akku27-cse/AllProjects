public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 9, 2, 7, 6 };
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
        for (int i = 0; i < arr.length;i++)
        System.out.println(arr[i]);
    }
}
