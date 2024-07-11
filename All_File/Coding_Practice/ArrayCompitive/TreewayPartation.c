#include<stdio.h>
int main(){
	int arr[3]={1,2,3};
	int a=1,b=3;
	int temp,i,l=0;
	int right=3-1;
	for(i=0;i<right;i++){
		if(arr[i]<a){
			temp=arr[i];
			arr[i]=arr[l];
			arr[l]=temp;
		}
		else
		if(arr[i]>b){
			temp=arr[i];
			arr[i]=arr[right];
			arr[right]=temp;
		right--;
		i--;
		}
	}
	printf("%d",right);
}
