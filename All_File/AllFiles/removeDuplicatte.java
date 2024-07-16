public class removeDuplicatte{
    public static void main(String[] args) {
        

        int arr[] = { 10, 10, 10, 10, 10, 20 };
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        
        temp[j++] = arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
              
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}