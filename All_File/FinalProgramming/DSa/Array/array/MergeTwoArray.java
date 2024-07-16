public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int arr2[] = { 4, 5, 6 };

        int a = arr.length;
        int b = arr2.length;

        int c = a + b;
        int c1[] = new int[c];


        for (int i = 0; i < arr.length; i++) {
            c1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            c1[a + i] = arr2[i];
        }


        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }

        System.err.println("min value=" + c1[0]);
        System.out.println("max value="+c1[c1.length-1]);
    
    }
}
