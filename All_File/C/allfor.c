#include<stdio.h>
int main(){
//	int i=65;
//	for(i>91;i++)
//	printf("\n%c",i);
//	while(i!=91){
//		i++;
//		printf("\n%c",i);
//	}
//do{
//	printf("\n%c",i);
//	i=i+1;
//}while(i!=91);
//lcm of two number
/*
int n1,n2,i;
printf("Enter any Number:\n");
scanf("%d",&n1);
printf("Enter second Number:\n");
scanf("%d",&n2);
//for(i=1;;i++){
i=1;
while(i){
i++;
	if(i%n1==0 && i%n2==0){
		printf("the %d and %d lcm is %d",n1,n2,i);
		break;
	}
}*/
//power of the number
int f=1,p,b,i=1;
printf("enter the base:\n");
scanf("%d",&b);
printf("enter the power:\n");
scanf("%d",&p);
for(i=1;i<=p;i++)
{
	f=f*b;
}
printf("%d",f);
}//fib seriese fisrst print c ar maan..then set a=b;b=c;c=a+b
