public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={2,8,9,1,3,6};
        int n=arr.length;
        int count=0,search=9,i;
        for (i = 0; i < n; i++) {
            if (search == arr[i]) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.print("found at position+"+i);
        }
    }
}