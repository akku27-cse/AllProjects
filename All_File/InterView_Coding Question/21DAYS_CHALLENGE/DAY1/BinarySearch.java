public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int search = 8, i, lb = 0, ub = arr.length-1;
        int mid = (lb + ub) / 2;
        while (lb <= ub) {
            if (arr[mid] < search) {
                lb = mid + 1;
            } else if (arr[mid] == search) {
                System.out.println("found at position " + mid);
                break;
            } else
                ub = mid - 1;
            mid = (lb + ub) / 2;
        }
        if(lb>ub)
        System.out.println("number mot exist");
    }
}
