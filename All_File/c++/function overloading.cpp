#include<iostream>
using namespace std;
// declarations (prototypes)
int volume(int);
double volume(double,int);
long volume(long,int,int);
int main()
{
	cout<<volume(10)<<"\n";
	cout<<volume(2.5,8)<<"\n";
	cout<<volume(100L,75,15)<<"\n";
	return 0;
}
// Function definitions
int volume(int s)//cude
{
	return(s*s*s);
}
double volume(double r,int h)//cylinder
{
	return(3.14519*r*r*h);
}
long volume(long 1,int b,int h)//rectangular box
{
	return(1*b*h);
}
