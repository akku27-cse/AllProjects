public class FIndMinAndMax {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 7, 8, 22, 33, 6, 45, 89, 5, 6, 9, 65, 66, 65, 6889, 898, 5, 8698, 5, 8 };
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    
        int min = arr[0];
        int max = arr[arr.length-6];
        System.out.println("min="+min+"max="+max);

    }
}
