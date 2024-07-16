public class PrimeNumber {
    public static void CheckPrimeNumber(int n) {
        int flag = 0;
        if (n < 0) {
            System.out.println("please Enter the Positive Number");
            return;   
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;

                }
            }

        }
        if (flag == 0) {
            System.out.println("this is prime Number");
        } else {
            System.out.println("this in not prime Nu,bner");
        }
    }

    public static void main(String[] args) {
        int n = -78;
        CheckPrimeNumber(n);

    }
}
