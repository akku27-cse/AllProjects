public class TechMonostic {
    static void findnumber(int n){
        if(n%2==0){
        
            System.out.println(((n/2)-1)*275+275);
               
        }
        else{
    
            System.out.println((2*(n/2))*275);
        }
    }
    
public static void main(String[] args) {
    
    int x=8;
    findnumber(x);

}
}
