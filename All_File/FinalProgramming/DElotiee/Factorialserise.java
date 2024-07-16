public class Factorialserise {
    public static void main(String[] args) {
        
        int n = 3; 
        int sum = 0, fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            sum = sum + (i / fact);
        }
        System.out.println(sum);    }
}
