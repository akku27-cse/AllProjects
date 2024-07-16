public class RemoveArrayFromPos {
    public static void main(String[] args) {
        
        int arr[] = { 1, 5, 6, 9, 7, 8, 3 };
        int pos = 3;

        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
