public class ReverseDigit{
    public static void main(String[] args) {
        int no = 188;
        int rem;
        int sum=0;
        while (no > 0) {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no = no / 10;
        }
        System.out.println(sum);
    }
}