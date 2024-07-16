public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n, rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n /= 10;
        }
        
        if (temp == sum) {
            System.out.println("this is armstron Number");
        } else {
            System.out.println("This is Not Armstrong Number");
        }
    }
}
