#include<stdio.

.+
h>
int main(){
	int n,a[100],i,j,min,temp;
	printf("Enter how many number:\n");
	scanf("%d",&n);
	printf("Enter the element:\n");
	for(i=1;i<n;i++){
		scanf("%d",&a[i]);
	}/*
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[min]>a[i]){
				min=j;
			}
		}
			if(min!=i){
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		
	}
	for(i=0;i<n;i++)
	printf("sorted list is %d\n",a[i]);
*/
for(i=1;i<n-1;i++){
	min=a[i];
	for(j=i+1;j<n;j++){
		if(a[j]<a[min]){
			min=j;
		}
	}
	if(min!=a[i]){
			temp=a[i];
				a[i]=a[min];
				a[min]=temp;
	}
}
printf("sorted element are\n");
for(i=1;i<n;i++)
printf("%d",a[i]);
}
