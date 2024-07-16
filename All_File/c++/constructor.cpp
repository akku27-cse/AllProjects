#include<iostream>
using namespace std;
class ABC
{
	public:
		ABC()//constructor defiend
{
	cout<<"Hey look i am constructor"<<endl;
}
~ABC()//destructor defiend
{
	cout<<"Hey look i am destrouctor"<<endl;
}
};
int main()
{
	ABC cc1;//construtor called automaticlly when object created
	cout<<"Function main is teminating....."<<endl;
	/*object cc1 gose out of the space now destructor being called*/
	return 0;
}
