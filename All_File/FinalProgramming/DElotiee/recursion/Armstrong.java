public class Armstrong {
    public static int isArmstrong(int n, int temp) {
    
        if (n == 0) {
            return temp;
}
      int rem=n%10;
      temp = temp + (rem * rem * rem);
        return isArmstrong(n/10, temp);
}

    public static void main(String[] args) {
        
        int n=153;
        int temp = isArmstrong(n, 0);
        if (temp == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
