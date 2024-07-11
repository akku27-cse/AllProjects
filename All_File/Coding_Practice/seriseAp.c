//arithamtic progrettin
#include<stdio.h>
int main(){
	int i,a=2,b=2,n=5,sum=0;
	int value=a;
	for(i=1;i<=n;i++){
		printf("%d \n",value);
		sum=sum+value;
		value=value+b;
	}
	printf("The sum of serise ap=%d",sum);
}
