#include<stdio.h>
int main(){
	int a[6]={1,2,3,4,5,6};
	int i,temp;
	//wave input-1,2,3,4,5,6   out :2 ,1 4,3,6,5   value alwayes increasing;
	for(i=0;i<6;i+=2){
		//swapping
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
	for(i=0;i<6;i++){
		printf("%d",a[i]);
	}
	
}
