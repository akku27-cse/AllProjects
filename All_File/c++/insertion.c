#include<stdio.h>
main()
{
	int LA[]={1,3,5,7,8};
	int item=10,K=3,n=5;
	int i=0,j=n;
	printf("the original array element are:\n");
	for(i=0;i<n;i++)
	{
		printf("LA[%d]=%d\n",i,LA[i]);
		
	}
	n=n+1;
	while(j<=K)
	{
		LA[j+1]=LA[j];
		j=j-1;
			}
			LA[K]=item;
			printf("The array element afetr insertion:\n");
			for(i=0;i<n;i++)
			{
				printf("LA[%d]=%d\n",i,LA[i]);
			}
}
