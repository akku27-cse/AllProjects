#include<stdio.h>
void quicksort(int number[25],int start,int last){//create fun
   int i, j, pi, temp;

   if(start<last){
      pi=start;
      i=start;
      j=last;

      while(i<j){
         while(number[i]<=number[pi]&&i<last)
            i++;
         while(number[j]>number[pi])
            j--;
         if(i<j){
            temp=number[i];
            number[i]=number[j];
            number[j]=temp;
         }
      }

      temp=number[pi];
      number[pi]=number[j];
      number[j]=temp;
      quicksort(number,start,j-1);//call fun
      quicksort(number,j+1,last);//call fun

   }
}

int main(){
   int i, count, no[100];

   printf("Enter how many element: ");
   scanf("%d",&count);

   printf("Enter %d elements: ", count);
   for(i=0;i<count;i++)
      scanf("%d",&no[i]);

   quicksort(no,0,count-1);//call fun

   printf("sorted element are: ");
   for(i=0;i<count;i++)
      printf(" %d",no[i]);

   return 0;
}
