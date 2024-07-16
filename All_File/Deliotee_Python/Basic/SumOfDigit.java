public class SumOfDigit {
    public static void main(String[] args) {
        
        int no = 89;
        int rem, sum = 0;
        while (no > 0) {
            rem = no % 10;
            sum = sum + rem;
            no/= 10;

        }
        System.out.println(sum);
    }
}
