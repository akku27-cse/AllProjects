public class nonRepeatingElement {
   public static void main(String[] args) {
       int[] arr = { 1, 1, 1, 1, 7,2 };
       int j;
       for (int i = 0; i < arr.length; i++) {
           boolean bool = false;
           for ( j = 1; j < arr.length; j++) {
               if (arr[i] != arr[j]) {
                   bool = true;
                   //result = arr[i];
                   break;

               }

           }
           if (bool) {
               System.out.println(arr[j]);
               break;
           }
       }
   }
}
