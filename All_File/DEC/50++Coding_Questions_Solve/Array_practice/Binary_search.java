public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 5;
        int lb = 0, ub = arr.length;
        int mid = (lb + ub) / 2;
        while (lb<=ub) {
            if (arr[mid] <target)
                lb = mid + 1;
           else if (arr[mid] == target) {
                System.err.println("found");
                break;
            } else
                ub = mid - 1;

            mid = (lb + ub) / 2;
        }
    }
}
