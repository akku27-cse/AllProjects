public class bubblesort {
    public static void main(String[] args) {
        
        // int a[]={7,3,5,4};
        // for(int i=0;i<a.length;i++){
        //     for(int j=1;j<a.length-1;i++){
        //         if(a[i]>a[j]){
        //             int temp=a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        int a[]={5,4,8,2,7,1};
		for(int i=1;i<a.length;i++){
          for(int j=0;j<a.length;j++){
          	if (a[j]>a[j+1]) {
          		int temp=a[j];
          		a[j]=a[j+1];
          		a[j]=temp;
          	}
        }
          
          for(i=0;i<a.length;i++)
          System.out.println(a[i]);
  }
    }
}
