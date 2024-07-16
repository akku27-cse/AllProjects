/**
 * LinearSerach
 */
public class LinearSerach {
    public static void Lnear() {
        int arr[] = { 2, 1, 9, 3, 7, 5 };
        int count = 0;
        int targt = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targt) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println("found");

        } else {
            System.out.println("not found");
        } 
    }

    public static void main(String[] args) {
        Lnear();
    }
}