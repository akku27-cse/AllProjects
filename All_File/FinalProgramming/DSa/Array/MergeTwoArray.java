public class MergeTwoArray {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr1 = { 5,6,7 };
        int a = arr.length, b = arr1.length;
        int c = a + b;
        int[] mergeArray = new int[c];
        
        for (int i = 0; i < a; i++) {
            mergeArray[i] = arr[i];
        }
        for (int i = 0; i < b; i++) {
            mergeArray[a + i] = arr1[i];

        }
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i]);
        }
    }
}
