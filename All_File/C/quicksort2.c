#include<stdio.h>
#include<stdlib.h>
void swap(int* a,int b){
	int t=a;
	a=b;
	a=t;
	
}
int partition(int arr[],int low,int high)
{
	int j;
	int pivot=arr[high];
	int i=(low-1);
	for(j=low;j<=high;j++){
		if(arr[j]<pivot){
			i++;
			swap(&arr[i],&arr[j]);
		}
		
	}
	swap(&arr[i+1],&arr[high]);
	return(i+1);
}
void quick_sort(int arr[],int low,int high){
	if(low<high){
		int pi=partition(arr,low,high);
		quick_sort(arr,low,pi-1);
		quick_sort(arr,pi+1,high);
	}
}
int main(){
	int a[100],n,i,j;
	printf("No of element to sort");
	scanf("%d",&n);
	printf("Enter the elemrnt:\n");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	quick_sort(a,0,n-1);
	printf("\n array after sorting");
	for(i=0;i<n;i++)
	printf("%d",a[i]);
	return 0;
}
