public class  LinearSearch{
    public static void main(String[] args) {
        
        int[] arr={5,7,1,3,9,2,12};

int search=9;
        int count=0,i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println(search + "si found at location" + i);
        } else {
            System.out.println("not found");
        }
    }
}