public class MergeTwoArray {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 5, 6 };

        int a = arr1.length, b = arr2.length;
        int c = a + b;
        int arr3[] = new int[c];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + a] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
    }
}