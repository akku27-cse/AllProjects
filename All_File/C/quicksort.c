#include <stdio.h>
void quicksort(int[],int,int);
void main()
{
	 int arr[20];
	  int size,i;
	   printf("Enter the numbe of Element\n");
	     scanf("%d",&size);
	        printf("Enter Element\n");
	           for (i = 0; i < size; i++)
	          {
              scanf("%d",&arr[i]);     
  	
	}
	       quicksort(arr,0,size-1);
	      printf("Sorted Element are:\n");
	    for (i = 0; i <size; i++)
	     {
	   printf("%d",arr[i] );
	 }

}
      void quicksort(int arr[],int low,int high)
      {
      	int pivot,i,j,temp;
      	  if (low<high)
      	  {
      	  	pivot=low;
      	  	 i=low;
      	  	  j=high;
      	  	   while(arr[i]<=arr[pivot] && i<=high)
      	  	   {
      	  	   	i++;
      	  	   }
      	  	  while(arr[j]>arr   [pivot] && j>=low)
      	  	  {
      	  	  	j--;
      	  	  }
      	  	if(i<j){
           temp=arr[i];
         arr[i]=arr[j];

       arr[j]=temp;


      	  	}
      	  }
      	  temp=arr[j];
      	  arr[j]=arr[pivot];
      	  arr[pivot]=temp;
      	  quicksort(arr,low,j-1);
      	  quicksort(arr,j+1,high);

      }
