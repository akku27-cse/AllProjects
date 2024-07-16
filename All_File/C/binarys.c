#include<stdio.h>
int main(){
	int mid,i,n,no,lb,ub,a[100],flag=0;
	printf("Enter How many number:\n");
	scanf("%d",&n);//4
	printf("Enter the number :\n");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);//1,2,3,4,5
	}
	printf("Enter the element to be search:\n");
	scanf("%d",&no);//4
	//set lb=0 ub=n-1 (0to 4)
	lb=0,ub=n-1;
	while(lb<=ub){//joto khon lb ta ub ar soman ba besi ma hochhe totkhon loop cholte thakbe(0<=4 then 2<=4 thenn
	mid=(lb+ub)/2;//mid=lb+ub/2 //(0+4)/2=2 then 3+4/2=3.5 3+4/2=4 4+4/2=4
	//check
	if(no==a[mid]){
		flag=1;
		break;
	}
	else{
		if(no>a[mid]){//4>2
			lb=mid+1;//3+1=3
		}
		else{
			ub=mid-1;
		}
	}
	}
	if(flag==0){
		printf(" not found");
	}
	else{
		printf("found");
	}
	return 0;
}
