#include<stdio.h>
int main()
{
	float x,y;
	char ch;
	printf("Enter the first number:\n");
	scanf("%f",&x);
	printf("Enter the second number:\n");
	scanf("%f",&y);
	printf("Enter\n + for add\n - fors sub\n* for multiply\n / for div\n");
	scanf("\n%c",&ch);
	switch(ch)
	{
		case '+':
		printf("Add=%f",(x+y));
		break;
		case '-':
		printf("sub=%f",(x-y));
		break;
		case '*':
		printf("mul=%f",(x*y));
		break;
		case '/':
		printf("div=%f",(x/y));
		default :
		printf("Invalid");
		 
	}
}
