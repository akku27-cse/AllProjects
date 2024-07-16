//reverse number 
// palindrome
public class EncapsulationPractice {
    public static void main(String[] args) {
        PracticeEncapsulation p1=new PracticeEncapsulation();
        p1.Palindrome();
        p1.Reverse();        
    }
}

//def -> combine of data memeber ,member function,in a singkle enity like as a class

class PracticeEncapsulation{
    //datamember
    int x=121;
     int r,sum=0;
     //palindrome or not 
    void Palindrome(){
       int temp=x;
        while(x>0){
           r=x%10;
           sum=(sum*10)+r;
           x=x/10;
        }
        if(temp==sum){
            System.out.println("the number is palimdroe");
        }
        else{
            System.out.print("the numberis mot palindroem");

        }

    }
    void Reverse(){
          
        while(x>0){
           r=x%10;
           sum=(sum*10)+r;
           x=x/10;
        }
        System.out.println(sum);
    
    }
}