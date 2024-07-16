public class QuickSort {
    public static int partation(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        // ata pivot er thik positon korar jonno
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pivt = partation(arr, low, high);
            quick(arr, low, pivt - 1);
            quick(arr,   , high);
    }
  }
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 6, 9, 8 };
        int n = arr.length;
        quick(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
    }
    }
}
