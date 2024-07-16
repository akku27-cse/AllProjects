public class Palindrome {
    public static void main(String[] args) {
        //input=121 out :its true
       int x=123;
       int temp=x,sum=0,rem;
       while(x>0){
        rem=x%10;
        sum=(sum*10)+rem;
        x=x/10;

       }
       System.out.println(sum);
       if(temp==sum){
        System.out.println("palndreome");
       }
       else
       System.out.println("not");


    }
}
