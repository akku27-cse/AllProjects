public class FindPairsOfSum{
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        int k = 1, count = 0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
    }
}