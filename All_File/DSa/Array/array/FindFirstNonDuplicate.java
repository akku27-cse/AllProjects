public class FindFirstNonDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1,     1, 2, 2, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            boolean bool = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    bool = true;
                    break;
                }

            }
            if (!bool) {
                System.out.println(arr[i]);
                break;
                        }
         }
    }
}
