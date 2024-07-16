public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int lb = 0, ub = arr.length,searh=8;
        int mid = (lb + ub) / 2;
        while (lb <= ub) {
            if (arr[mid] < searh) {
                lb = mid + 1;
            } else if (arr[mid] == searh) {
                System.out.println("found at position " + mid);
                break;
            } else
                ub = mid - 1;

            mid = (lb + ub) / 2;

        }
          
    }
}
