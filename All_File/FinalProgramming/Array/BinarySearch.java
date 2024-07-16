public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;

        int ub = arr.length - 1, lb = 0;
        int mid = (ub + lb) / 2;

        while (lb <= ub) {
            if (arr[mid] < target) {
                lb = mid + 1;
            } else if (arr[mid] == target) {
                System.out.println("found");
                break;
            }

            else {
                ub = mid - 1;
            }
            mid = (ub + lb) / 2;
        }
    }

}
