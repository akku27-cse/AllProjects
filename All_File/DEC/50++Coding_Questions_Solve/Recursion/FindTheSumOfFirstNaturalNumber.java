public class FindTheSumOfFirstNaturalNumber {
    public static void Print(int no,int sum) {
        
        if (no == 0) {
            System.out.println(sum);
            return;
        }
        //System.out.println(sum);
        sum = sum + no;
        
        Print(no - 1,sum);
        
        //System.out.println(sum);
    }
    public static void main(String[] args) {
        int no = 10;
        int sum = 0;
        Print(no,0);
    }
}
