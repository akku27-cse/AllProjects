public class sumOfdigit {
    
    public static void main(String[] args) {
        int m=56,rem,sum=0;
        while(m>0){
            rem=m%10;
            sum=sum+rem;
            m=m/10;
        }
        System.out.println(sum);
    }
}
