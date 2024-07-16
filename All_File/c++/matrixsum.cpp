#include<iostream>
using namespace std;
class sub
{
	public:
		void sum(int r,int c)
		{
			int m1[r][c],m2[r][c],s[r][c];
			cout<<"Enter the elements of first matrix:";
			for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
			{
				cin>>m1[i][j];
			}
			}
			cout<<"Enter the elements of second matrix:";
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					cin>>m2[i][j];
				}
			}
			cout<<"OUTPUT:";
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				s[i][j]=m1[i][j]-m2[i][j];
				cout<<s[i][j]<<"";
				}
			}
		}
};
int main()
{
	sub obj;
	int row,col;
	cout<<"Enter the number of rows:";
	cin>>row;
	cout<<"Enter the number of column:";
	cin>>col;
	obj.sum(row,col);
	return 0;
}
