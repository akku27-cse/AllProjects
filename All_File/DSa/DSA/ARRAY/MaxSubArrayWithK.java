public class MaxSubArrayWithK {
    public static void main(String[] args) {
        

        int[] arr = { 4, 1, 2, 7 };
        int arr2[] = new int[arr.length - 1];

        int result = 0;
        int sum = 1;

        for (int i = 0; i < arr.length; i++) {

            sum = sum * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
    System.out.println(sum/arr[i    ]);
}


    }
}
