////////#include<stdio.h>
////////int main(){
////////	for(char ch='a';ch<='z';ch++){
////////	
////////	printf("%c",ch);
////////}
////////}
//////#include<stdio.h>
//////int main(){
//////	int no;
//////	printf("Enter any number:");
//////	scanf("%d",&no);
//////	printf("Natural number is given below:");
//////	0for(int i=0;i<=no;i++){
//////		printf("%d",i);
//////	}
//////	}
////#include<stdio.h>
////int main(){
////	int f,no,b;
////	printf("Enter any number :");
////	scanf("%d",&no);
////	f=no%10;
////	while(no!=0)
////	{
////		b=no%10;
////		no=no/10;
////	}
////	printf("First digit is:%d last digit is:%d",b,f);
////	
////}
//#include<stdio.h>
//int main(){
//	int m=1,no,b;
//	printf("Enter any Number:");
//	scanf("%d",&no);
//	do{
//		b=no%10;
//		m=m*b;
//		no=no/10;
//		
//	}while(no!=0);
//	printf("%d",m);+
//}
#include<stdio.h>
int main(){
	int cpy,r,no,b;
	printf("Enter any number:");
	scanf("%d",&no);
	cpy=no;
	r=0;
	do{
		b=no%10;
		r=r*10+b;
		no=no/10;
	}while(no!=0);
	if(cpy==r){
		printf("palindrome");
	}
	else{
		printf("not palindrome"); 
	}
}
