#include<stdio.h>
int main(){
	int a=81,b=90;
	while(a!=b){
		if(a>b){
			a=a-b;
		}
		else
		b=b-a;
	}
	printf("%d",a);
}
