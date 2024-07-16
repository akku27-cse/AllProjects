public class TwoSum {
    
    public static void main(String[] args) {
        int arr[] = { 3,2,4 };
        int target = 6;
        int count = 0;
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println(i+" "+j);

                } 
            }
        }    
    }
}
