public class FindSeondSmallest {
    

    public static void main(String[] args) {
        
        int[] arr = { 1,1,3,6,7,7,9,1,1,1,1,2};
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

            for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println("Second Smallest Number=" + arr[i + 1]);
                break;
            }
        }
        }
        
    }

