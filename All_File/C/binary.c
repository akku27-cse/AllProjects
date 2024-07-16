#include<stdio.h>
int main()
{
	int mid,lb,ub,flag=0,i,no,n,a[10];
	printf("how many element enter:");
	scanf("%d",&n);
	printf("Enter the element:");
	for (i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("Which element are you search :");
	scanf("%d",&no);
	lb=0;ub=n-1;
	while(lb<=ub){
		mid=(lb+ub)/2;
		if(no==a[mid])
		{
			flag=1;
			break;
		}
		else{
			if(no>a[mid])
			lb=mid+1;
			else
			ub=mid-1;
		}
			}
	if(flag==0)
	printf("not found");
	else
	printf("Found");
	return 0;
}
