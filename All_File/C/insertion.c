#include <stdio.h>
void main()
{
	int i,j,k,temp;
	int arr[6]={12,10,8,9,6,4};
	printf("Sorted element\n");
	for ( k= 1; k< 6; k++)
	{
		temp=arr[k];
		j=k-1;
		while(j>=0 && temp<=arr[j])
		{
			arr[j+1]=arr[j];
			j=j-1;

		}
		arr[j+1]= temp;

		
	}
	for ( i = 0; i < 6;i++)
	{
		printf("%d",arr[i] );
		
	}
}
