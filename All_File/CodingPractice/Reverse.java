// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Reverse {
    public static void main(String[] args) {
       //reverse Number
       int n=123;
       //palindrome
       int temp=n;
       
       int sum=0,rem;
       while(n>0){
           rem=n%10;
           sum=(sum*10)+rem;
           n=n/10;
           
       }
       System.out.print(sum);
       if(sum==temp){
          System.out.println("This is Palindrome Number ");
       }
       else
       System.out.println("This is not Plaindrome Number");
    }
}