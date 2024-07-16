public class Armstrong{
    public static void main(String[] args) {
        
        int no=153;
        int rem, count = 0, temp = no;
        while (no > 0) {
            rem = no % 10;
            count = count + (rem * rem * rem);
            no = no / 10;
        }
        if (temp == count) {
            System.out.println("armstrong");
        }else
        System.out.println("not Armstrong");
    }
}