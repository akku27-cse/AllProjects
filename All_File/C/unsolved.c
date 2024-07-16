#include<stdio.h>
#include<stdlib.h>
#define max 7
void printarr(int count){
	int i;
	for(i=0;i<count-1;i++)
	{
		printf("=");
		
	}
	printf("=\n");
	
}
//void display(){
//	int i;
//	printf("[");
//	for(i=0;i<max;i++)
//	{
//		printf("%d",int)
//	}
//}
void insertsort(){
	int value;
	int pos;
	int arr[10],n,i;
	printf("enter the number of element:");
	scanf("%d",&n);
	printf("enter the number in array:");
	for(i=0;i<n;i++){
	
	scanf("%d",&arr[i]);}
	

value=arr[i];
pos=i;
while((pos>0) && arr[pos-1]>value){
	arr[pos]=arr[pos-1];
	pos=pos-1;
	printf("item:%d\n",arr[pos]);
}
//if(pos!=i){
//	printf("item inserted: %d\n, at position:%d\n",)
//}
}
int main(){
 printf("after sortimg");
 printarr(count, n);
 insertsort(count ,n);
 printarr(count, n)

}
