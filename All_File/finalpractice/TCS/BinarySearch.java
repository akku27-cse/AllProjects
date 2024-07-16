public class BinarySearch{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};
        int search=7;
        int a=0,b=arr.length;
        int mid = (a + b) / 2;

        while (a<=b) {
            if (arr[mid] < search) {
                a = mid + 1;

            } else if (arr[mid] == search) {
                System.out.println("found");
                break;

            }
            else
                b = mid - 1;
            mid = (a + b) / 2;
        }
    }
}