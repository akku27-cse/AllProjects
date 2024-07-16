public class FindSecondLargest {
    public static void main(String[] args) {
        
        int[] arr = { 5, 5, 5, 5, 9 };
        int count=0,temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    
                    System.out.println("second maximum value="+arr[j]);
                    break;
                }
            }
            break;
        }

    }
}
