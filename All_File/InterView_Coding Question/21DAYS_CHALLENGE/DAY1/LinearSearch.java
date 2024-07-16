public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 2, 8, 9 };
        int searh = 8;
        int count = 0,i, value=0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searh) {
                count++;
                value = i;
            }
        }
        if (count == 1) {
            System.out.println(searh+"found at position"+value);
        } else {
            System.out.println("not found");
        }
    }
}