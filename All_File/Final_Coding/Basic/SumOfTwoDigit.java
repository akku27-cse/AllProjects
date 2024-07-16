public class SumOfTwoDigit {
        public static void main(String[] args) {
        int n = 98;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
