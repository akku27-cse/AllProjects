public class Threesum {

    
    public static void main(String[] args) {
    
    
        int arr[] = { 2, 2, 3, 2, 2, 4 };
         int target = 8;
         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; i++) {
                 if ((arr[i] + arr[j] + arr[j + 1]) == target) {
            System.out.println(i+""+j+""+j+1);
        }
    }
}
}
    
}
