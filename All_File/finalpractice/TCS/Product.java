public class Product {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 12 };
        
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = sum * arr[j];
                }
                

            }
            arr2[i] = sum;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
