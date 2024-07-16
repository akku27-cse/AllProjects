//3  5  7  11 13 17 19 23

public class Prime {
    public static void main(String[] args) {
        int n = 21,count=0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;  
            }
        }
        if (count == 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime Number");
        }
    }
}
