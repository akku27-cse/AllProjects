public class PrintFastAndLastDigit {
    public static void main(String[] args) {
        int no = 9877;
        int rem=0, sum;
        int rem2 = no % 10;
        while (no > 0) {
            rem = no % 10;
            sum = rem;
            no /= 10;
        }
         System.out.println(rem2);
    System.out.println(rem);
    }
}
