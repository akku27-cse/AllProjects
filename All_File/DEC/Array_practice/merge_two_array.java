import java.util.*;
public class merge_two_array{
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 5, 6 };
        int a=arr1.length,b=arr2.length;
        int c = a + b;
        int c1[] = new int[c];
        for (int i = 0; i < a; i++) {
            c1[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            c1[a + i] = arr2[i];
        }

        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }
    }
}