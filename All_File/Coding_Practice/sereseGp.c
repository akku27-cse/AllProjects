#include<stdio.h>
int main(){
	int i,first=2,pos=5,ratio=2,sum=0,value;
	value=first;
	for(i=0;i<pos;i++){
		printf("%d  \n",value);
		sum=sum+value;
		value=value*ratio;
	}
	printf("sumof the seresr gp=%d",sum);
}  
