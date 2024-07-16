/**
 * PlusOne
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int i = arr.length;
        while (i >= 0) {
            if (arr[i] != 9) {
                arr[i] = arr[i] + 1;
            }
            arr[i] = 0;
        }
        int arr2[] = new int[arr.length + 1];
        arr[0] = 1;
          
    }
}