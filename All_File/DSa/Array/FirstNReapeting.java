public class FirstNReapeting {
    public static void main(String[] args) {
        
        int[] arr = {1,1, 3, 6, 6, 8, 9, 9, 7, 14 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean boll = false;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    boll=true;
                    count++;
                    break;
                }
            }
            
            if (!boll) {
                System.out.println("non reapeting Number=" + arr[i]);
                break;
        }
        }

    }
}
