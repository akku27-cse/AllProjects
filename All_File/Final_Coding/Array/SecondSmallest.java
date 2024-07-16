public class SecondSmallest {
    public static void main(String[] args) {
        


        int arr[] = { 1, 1, 2, 3, 4 };
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j] && i!=j) {
                    break;
                }
                result = arr[j];
                break;
            }
            break;
        }
        System.out.println(result);
    }
}
