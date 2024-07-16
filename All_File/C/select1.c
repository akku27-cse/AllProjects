#include <stdio.h>
int main()
{
	int arr[5]={5,2,8,3,4};
	int n=5;
	int i,j,pos,swp;
	for(i=0;i<n-1;i++)
	{
		pos=i;
		for(j=1;j<n-1;j++)
		{
			pos=j;
		}
		if(pos!=i)
		{
			swp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=swp;

		}
	}
	printf("sorted array is:\n" );
	for(i=0;i<n;i++)
		printf("%d\t",arr[i] );
	    return 0;
	
}
    
