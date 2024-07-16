public class FindNonRepeating{
    public static void main(String[] args) {
        
        int[] arr = { 2, 2, 3,5,3,1,9,5,9 };
        
        for (int i = 0; i < arr.length; i++) {
            boolean boll = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    boll = true;
                }
            }
            if (!boll) {
                System.out.println(arr[i]);
            }
        }
    }
}