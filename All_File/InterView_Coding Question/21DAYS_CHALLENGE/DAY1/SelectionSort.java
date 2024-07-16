public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 1, 8, 5 };
        int pos,temp,i,j;
        for (i = 0; i < arr.length-1; i++) {
            pos = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
                if (pos != i) {
                    temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
