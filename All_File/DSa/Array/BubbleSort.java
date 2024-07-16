public class BubbleSort{
    public static void main(String[] args) {
        
        int arr[] = { 5, 3, 4, 9, 7, 2 };
        int n = arr.length, temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}