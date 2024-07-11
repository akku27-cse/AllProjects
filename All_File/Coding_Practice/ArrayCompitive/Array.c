#include<stdio.h>
int main(){
	int i,a[6]={4,3,5,7};
	int s=5,found=0;
	int newvalue=9;
	int deletee=9;
	for(i=0;i<5;i++){
		printf("%d",a[i]);
		//1.search
		if(a[i]==s){
			found++;
		}
				if(a[i]==NULL){
					a[i]=newvalue;
				}
				if(a[i]==9)
{
	a[i]=-1;
		}		
	}
	if(found==1){
		printf("element is found at poiton at ");
	}
	else
	printf("element is not found");
	
	//2.insert
	for(i=0;i<6;i++){
		printf("%d",a[i]);
	}
}
