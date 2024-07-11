#include<stdio.h>
int main(){
	int rem,n=1153,i,temp,sum=0;
	temp=n;
	while(n>0){
		rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(temp==sum){
		printf("The number armstrong number");
	}
	else
	printf("number is not armstrong number");
}
