#include<stdio.h>
int main(){
	int i,n,no,a[100],flag=0;
	printf("How many number:\n");//4
	scanf("%d",&n);//4
	printf("Enter element:\n");//1,2,3,4
	for(i=0;i<n;i++){//0
		scanf("%d",&a[i]);
	}
	printf("Enter the element to be search:\n");
	scanf("%d",&no);
	for(i=0;i<n;i++){//
		if(a[i]==no){
			flag=1;
	}
}
	if(flag==0){
			printf("%d not Found");
			
		}
		else{
			printf(" %d found");
			
		}
}
