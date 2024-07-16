public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 1, 6, 1, 8, 9 };
        int len = arr.length;
        
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int j = 0;
        for (int i = 0; i < len-1; i++) {
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[len - 1];
        for(int i=0;i<j;i++)
System.out.println(arr[i]);
    }
}
