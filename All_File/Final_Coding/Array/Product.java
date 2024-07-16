public class Product {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        int a = arr.length;
        int newArr[] = new int[a];

        for (int i = 0; i < arr.length; i++) {

            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }

            }
            newArr[i] = product;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
