public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 9, 7, 8 };
        for (int i = arr.length-1; i >= 0; --i) {
            System.out.println(arr[i]);
        }
    }
}
