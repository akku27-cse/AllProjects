public class BinarySearch {
    public static void main(String[] args) {
        

        int[] arr = { 1, 2, 3, 4, 5, 6,};
        int n = arr.length;
        int lb = 0, ub = arr.length-1;
        int mid = (ub +lb) / 2;
        int search = 9;
        int count = 0;
        while (lb <= ub) {
            if (search > arr[mid]) {
                lb = mid + 1;

            } else if (arr[mid] == search) {
                System.out.println("found ");
                count++;
                break;
            } else
                ub = mid - 1;
            mid = (ub +lb) / 2;

        }
        if (count == 0) {
            System.out.println("not found");
        }
    }
}
