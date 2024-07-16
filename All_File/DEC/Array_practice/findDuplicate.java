public class findDuplicate {
    public static void main(String[] args) {

        int arr1[] = { 4,4, 8, 6, 3, 7, 2, 9,8, 45, 23, 14, 87,87 };
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
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] == arr1[i + 1]) {
            System.out.println("duplicate value is="+arr1[i]);
        }
    }
    
    }
}
