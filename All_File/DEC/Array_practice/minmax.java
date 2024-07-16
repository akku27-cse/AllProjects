public class minmax {
    public static void main(String[] args) {
        
        int arr1[] = { 4, 8, 6, 3, 7, 2, 9,45,23,14,87 };
        int temp;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("min value=" + arr1[0]);
        System.out.println("max value="+arr1[arr1.length-1]);
    }
}
