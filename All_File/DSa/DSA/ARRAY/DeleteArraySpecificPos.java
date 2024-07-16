public class DeleteArraySpecificPos {
    

    public static void main(String[] args) {
        
        
        int[] arr = { 1, 9, 2, 3, 4, 7 };
        int n = arr.length-1;
        int pos = 3;
        for (int i = pos - 1; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
    
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
