public class gcdOfTwoNuymber {
    public static void main(String[] args) {
        

        int no1 = 21, no2 = 27;
        int gcd = 0;
        for (int i = 1; i <= no1 && i <= no2; i++) {
            if (no1 % i == 0 && no2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
