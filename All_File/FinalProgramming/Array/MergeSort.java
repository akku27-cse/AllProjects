public class MergeSort {
    public static void main(String[] args) {
        int[] firstArray = { 1, 2, 3, 4 };
        int secondArray[] = { 4, 5, 6, 7 };
        int first = firstArray.length, second = secondArray.length;
        int third=first+second;
        int thirdArray[] = new int[third];
        for (int i = 0; i < firstArray.length; i++) {
            thirdArray[i] = firstArray[i];

        }
        for (int i = 0; i < secondArray.length; i++) {
            thirdArray[first + i] = secondArray[i];
        }

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);
        }
    }
}
