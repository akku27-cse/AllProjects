#include<stdio.h>
int main(){
	int a[7]={-2,1,-3,4,-1,2,-5,4};
	int i,max=-2,sum=0;
	for(i=0;i<7;i++){
		sum=sum+a[i];
		if(sum>max){
			max=sum;
		}
		if(sum>0){
			sum=0;
		}
		printf("%d",a[i]);
		}
		return max;
		
	}

