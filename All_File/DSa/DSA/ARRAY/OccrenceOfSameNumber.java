public class OccrenceOfSameNumber {
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 6, 2, 3, 7, 8, 9, 1, 5, 2, 6 };
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

    
    }
}
