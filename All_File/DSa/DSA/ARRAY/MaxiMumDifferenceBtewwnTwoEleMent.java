public class MaxiMumDifferenceBtewwnTwoEleMent {
    
    public static void main(String[] args) {
        

        int[] arr = { 2, 8, 9, 3, 12, 7, 5, 8, 21 };
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int result = arr[arr.length-1] - arr[0];

        System.out.println("maximum Differences two Number="+result);
    }
}
