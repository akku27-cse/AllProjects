public class SumOfSerise {
    public static void main(String[] args) {
        
//1/1+1/2+1/3....1/n

int n = 5, sum = 1;;
for (int i = 1; i <= n; i++) {
    sum = sum + (1 / i);
}
System.out.println(sum );
    

}
}
