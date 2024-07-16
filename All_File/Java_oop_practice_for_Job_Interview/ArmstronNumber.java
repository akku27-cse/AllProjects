public class ArmstronNumber {
    public static void main(String[] args) {
        
        int x=153;
        int sum=0,rem;
        int temp=x;
        while(x>0){
            rem=x%10;
            sum=sum+(rem*rem*rem);
            x=x/10;
        }
        if(temp==sum){
        System.out.println("this is armstronf number");
        }
        else{
            System.out.println("this not armstrong Number");
        }
    }
}
