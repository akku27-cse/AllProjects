public class LeanerSearch {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 5, 6, 8, 1, 9 };

        int searrch = 7;
        int count = 0, i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searrch) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println(searrch + "is found at position" + arr[i]);
        } else {
            System.out.println("not found");
        }
    }
}