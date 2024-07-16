public class CountNum {
    public static void main(String[] args) {
    
        int arr[] = { 1, 2, 3, 1, 4, 5, 12, 3, 4, 5, 1, 1 };
        int find = -1;
        int count=0,i;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                count++;
            }

        }
        if (i == arr.length)  {
            System.out.println("Not peresent in array");
        }else
        System.out.println(find+"is ocuuer at"+count+"times");
   } 
}
