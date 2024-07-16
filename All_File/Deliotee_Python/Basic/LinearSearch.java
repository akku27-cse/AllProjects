public class LinearSearch {


    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 6, 9, 2, 3, 14, 21, 10, 87 };
        int target=9;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("found ");
        } else {
            System.out.println("not Foud");
        }
    }
}

