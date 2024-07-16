public class FindPAirs {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 7;
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

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}