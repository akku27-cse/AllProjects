public class MergeTwoArray {
    

    public static void main(String[] args) {
        

        int[] arr = { 4, 6, 7,1 };
        int a = arr.length;
        int[] arr2 = { 7,3,2,5 };
        int b = arr2.length;
        int c = a + b;
        int c1[] = new int[c];


        //process merge
        for (int i = 0; i < arr.length; i++) {
            c1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            c1[a + i] = arr2[i];
        }
        System.out.println("after Sorting");
        for (int i = 0; i < c1.length; i++) {
            System.out.print(","+c1[i]);
        }
        System.out.println("before sorting");
        //for sorting
        

        int temp,pos;
        for (int i = 0; i < c1.length-1; i++) {
            pos = i;
            for (int j = i + 1; j < c1.length; j++) {
                if (c1[pos] > c1[j]) {
                    pos = j;
                }
                if (pos != i) {
                    temp = c1[i];
                    c1[i] = c1[pos];
                    c1[pos] = temp;
                }
            }

        }
        for (int i = 0; i < c1.length; i++) {
        System.out.println(c1[i]);
    }
    }
}
