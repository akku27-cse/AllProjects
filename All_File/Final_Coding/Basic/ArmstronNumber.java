public class ArmstronNumber {
    public static void main(String[] args) {
        int no = 153;
        int rem, sum = 0;
        int temp = no;
        while (no > 0) {
            rem = no % 10;
            sum = sum + (rem * rem * rem);
            no = no / 10;
        }
        if (sum == temp) {
            System.out.println("this is armstrong number");
        } else {
            System.out.println("This is Not Armstrong Nummber");
        }
    }
}
