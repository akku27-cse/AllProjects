public class SumofTwoDigit {
    public static void main(String[] args) {
        
    Sum s=new Sum();
    s.dispaly();
    }
}


//  sum of two digit
class Sum{
    void dispaly(){
    int x=78;
    int r,sum=0;
    while(x>0){
      r=x%10;
      sum=sum+r;
      x=x/10;
    }
    System.out.println(sum);
}
}