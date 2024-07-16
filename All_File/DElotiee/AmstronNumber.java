public class AmstronNumber {
    public static void main(String[] args) {
        

        int no = 100;
        int rem,count=0,temp=no;
        while (no > 0) {
            rem = no % 10;
            count = count + (rem * rem * rem);
            no /= 10;
        }
        if (count == temp) {
            System.out.println("This is armstrong Number");
        } else {
            System.out.println("This in not Armstrong Number");
        }
    }
}
