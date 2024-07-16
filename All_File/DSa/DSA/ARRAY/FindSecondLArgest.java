public class FindSecondLArgest {
    
    public static void main(String[] args) {
        int[] arr = { 1,1,3,6,7,7,9,1,1,1,1,2};
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
        int n = arr.length-1;

        
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.println(arr[i]);

        }
        if(arr[n]!=arr[n-1])
        System.out.println("second heighest Number"+arr[n-1]);
        
       
        
        }
        
    }

