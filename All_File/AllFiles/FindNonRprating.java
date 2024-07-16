public class FindNonRprating {
    public static void main(String[] args) {
        
        int arr[] = { 10, 10, 10, 20, 30, 30, 40,40   };
        
         for (int i = 0; i < arr.length; i++) {
             boolean boll = false;
             for (int j = 1; j < arr.length; j++) {
                 if (arr[i] == arr[j] && i!=j) {
                     boll = true;
                     break;
                 }

             }
             if (!boll) {
                System.out.println(arr[i]);
             }
         }
         
        

    }
}
