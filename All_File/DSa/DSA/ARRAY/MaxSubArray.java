import java.util.*;;
public class MaxSubArray {
    
    public static void main(String[] args) {

        int[] arr = { 1, 2, -5, 4, 8, 5, 3 };
        int sum = arr[0];
        int maxSum = arr[0];
 
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = sum + arr[i];

            }
            else {
                sum = sum + arr[i];
            }

            maxSum = Math.max(sum,maxSum);
        }
    System.out.println(maxSum);
    }
    
}
