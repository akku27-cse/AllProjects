public class NonRepeating {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 1, 2, 2, 2, 2, 3,3 ,4,4,5 };
        for (int i = 0; i < arr.length; i++) {

            boolean bool = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    bool = true;
                    break;
                }
            }
            if (bool!=true) {
                System.out.println(arr[i]);
                
            }

        }
    }
}
