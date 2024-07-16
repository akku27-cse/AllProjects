public class deleteDuplicate {
    public static void main(String[] args) {
                int arr1[] = { 4,4, 8, 6, 3, 7, 2, 9,8, 45, 23, 14, 87,87 };
        int temp;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        int n=arr1.length;
        //int temp[] = new int[n];

    int j=0;
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] != arr1[i + 1]) {
                arr1[j++] = arr1[i];
        }
        
    }
    arr1[j++]=arr1[arr1.length-1];
    System.out.println(arr1[j]);
    
    }
    }
