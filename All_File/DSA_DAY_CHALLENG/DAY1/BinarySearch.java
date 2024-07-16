public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 8, 9 };
        int seach = 8;
        int lb = 0, ub = arr.length;
        int mid = (ub + lb) / 2;
int count=0;

        while (lb <= ub) {
            if (arr[mid] > seach) {
                lb = mid + 1;
            } else if (arr[mid] == seach) {
                System.out.println("fond at position=" + mid);
                count++;
                break;
            } else {
                ub = mid - 1;

            }
            mid = (ub + lb) / 2;
            if (lb > ub) {
    System.out.println("not found");  
}
        }
       
    }
}
