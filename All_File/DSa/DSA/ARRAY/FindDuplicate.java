public class FindDuplicate {
    

    public static void main(String[] args) {

        int[] arr = { 2, 2, 3, 5, 3, 1, 9, 5, 9 };

        for (int i = 0; i < arr.length; i++) {
        
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;  
                }
            }
           
        }
    }
}
