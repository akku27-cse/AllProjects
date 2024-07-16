public class FindCommonElement {
    

    public static void main(String[] args) {
        

        int[] arr = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 6, 8, 9 };
        for (int i = 0; i < arr.length && i< arr2.length; i++) {
            if (arr[i] == arr2[i]) {
    System.out.println(arr2[i]);
} else {
    System.out.println("not matcing  ");
}
        }
    }
}
