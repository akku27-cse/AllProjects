#include<stdio.h>
int main(){
	int a=80,b=90,i,gcd,lcm;
	for(i=1;i<=a&&i<=b;i++)
	{
		if(a%i==0&b%i==0){
			gcd=i;
		}
	}
		lcm=(a*b)/gcd;
printf("%d",lcm);		
	
}
