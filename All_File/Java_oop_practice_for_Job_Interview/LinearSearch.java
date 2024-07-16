public class LinearSearch {
    public static void main(String[] args) {
        
        int a[]={7,5,9,3,7};
        int s=8;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(s==a[i]){
                count++;
            }

        }
        if(count==1){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
