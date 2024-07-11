#include<stdio.h>
int main(){
	int a[3]={3,2,3};
	int i,count=0;
	int cand=0;
	for(i=0;i<3;i++){
		if(count==0){
			cand=a[i];
		}
		if(cand==a[i]){
			count++;
		}
		else{
			count--;
		}
		//return cand;
		
	}
	printf("%d",cand);
}
