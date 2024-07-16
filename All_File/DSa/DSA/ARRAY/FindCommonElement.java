public class FindCommonElement {
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 4, 8, 7 };
        int[] arr3 = { 1, 6, 7, 8 };
        for (int i = 0; i < arr.length && i < arr2.length && i < arr3.length; i++) {
            if (arr[i] == arr2[i] && arr2[i]== arr3[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
