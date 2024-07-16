public class findFirstRepetingElement {
    public static void main(String[] args) {
        int arr[] = { 6, 6, 7, 8, 8, 9 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i != j && arr[i] == arr[j])
                    break;
            
                System.out.println(arr[i]);

            }
        }
    }
}