public class NonRepeating {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2,2,2,2,4 };

        for (int i = 0; i < arr.length; i++) {
            boolean boll = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    boll = true;
                    break;
                }
            }
            if (!boll) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}