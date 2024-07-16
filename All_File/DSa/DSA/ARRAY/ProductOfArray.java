public class ProductOfArray {
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result = result * arr[i];
        }
        System.out.println(result);
    }
}
