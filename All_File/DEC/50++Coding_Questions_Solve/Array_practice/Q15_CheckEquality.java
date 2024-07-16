import java.util.Scanner;

public class Q15_CheckEquality {
    public static void checkEquality(int arr[], int arr2[]) {
        int count = 0;
        int s = arr.length;
        System.out.println(s);
        int s2=arr2.length;
        System.out.println(s2);
        if(s!=s2){
        System.out.println("this is not equal");
        return;
      }

        
      for (int i = 0; i < arr.length && i < arr2.length; i++) {
          if (arr[i] == arr2[i]) {
              count++;
          } else {
              count--;
          }
      }
          
          if (count == arr.length) {
              System.out.println("aray is same ");
          }
          else
          System.out.println("are are not equal");
        
}    

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter size of First Array");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the value");
        for(int i=0;i<no;i++)
            arr[i] = sc.nextInt();

           // Scanner sc = new Scanner(System.in);
        System.out.println("enter size of Second Array");
        int no2 = sc.nextInt();
        int arr2[] = new int[no];
        System.out.println("Enter the value");
        for (int i = 0; i < no2; i++)
            arr2[i] = sc.nextInt();
       
       
            checkEquality(arr, arr2);

    }
}
