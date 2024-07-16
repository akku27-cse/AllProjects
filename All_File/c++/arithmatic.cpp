#include<iostream.h>
int main()
{
	int first,second,add,subtract,multiply;
	float divide;
	cout<<"enter two integers\n";
	cin>>first>>second;
	add=first+second;
	subtract=first-second;
	multiply=first*second;
	devide=first/(float)second;
	//typecasting
	cout<<"sum="<<add<<"\n";
	cout<<"differnce="<<subtract<<"\n";
	cout<<"multiplication="<<multiply<<"\n";
	return 0;
}
