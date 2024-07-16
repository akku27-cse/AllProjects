#include<stdio.h>
int main()
{
	int arr[]={6,2,4,5,10 };
	int n=5;
	printf("Before sorting:\n" );
	printarray(arr,n);
	bubblesort(arr,n);
	printf("After sorting:\n");
	printarray(arr,n);
	return 0;


}
void printarray(int*arr,int n){
	int i;
	for ( i = 0; i < n; i++)
	{
		printf("%d",arr[i] );

	}
	printf("\n");
}
void bubblesort(int*arr,int n)
{
	int temp,i,j;
	for(i=0;i<n-1;i++)
	{
		for (j=0;j<n-1;j++)
		{
			if (arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
