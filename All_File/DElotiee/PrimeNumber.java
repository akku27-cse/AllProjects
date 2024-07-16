public class PrimeNumber {
    
    public static void main(String[] args) {
        int no = 21,flag=0;
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("This is not prime Number");
        } else {
            System.out.println("this is Prime Number");
        }
    }
}
