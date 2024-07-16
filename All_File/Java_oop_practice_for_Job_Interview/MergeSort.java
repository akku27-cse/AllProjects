public class MergeSort {

    public static void conquere(int arr[], int s1,int mid,int s2) {
        // first crate notun array jta sortedc value store korbe 
        int merge[]=new int[s2-s1+1];

        int indx1=s1;
        int indx2=mid+1;
int x=0;
        //conqure means add the divaide array
        while (indx1 <= mid && indx2 <= s2) {
            if (arr[indx1] <= arr[indx2]) {
                merge[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merge[x++] = arr[indx2++];

            }
            while (indx1 <= mid) {
 merge[x++] = arr[indx1++];
            
            }
            while (indx2 <= s2) {
                merge[x++] = arr[indx2++];

            }
            for (int i = 0, j = s1; i < merge.length; i++, j++) {
                arr[j] =merge[i];
    }
  }



    }

    public static void divide(int arr[], int s1, int s2) {
        if (s1 >= s2) {
            return;}
// divide the array and calcluate mid --
        int mid =s1+(s2-s1) / 2;
        divide(arr, s1, mid);
        divide(arr,mid+1,s2);
        conquere(arr, s1, mid, s2);
        

}
    public static void main(String[] args) {
        

        int[] arr = { 3, 5,4,8,1 };
       // System.out.println(arr.length);

        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
