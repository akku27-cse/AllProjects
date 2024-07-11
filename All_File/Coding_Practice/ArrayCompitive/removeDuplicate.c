#include<stdio.h>
int main(){

int a[6]={2,7,9,2,3,4};
int i,j;
for(i=0;i<6;i++){
	for(j=i+1;j<6;j++){
		if(a[j]==a[i]){
			a[i]=-1;
			    temp=a[i];
		}
	
	}
		printf("%d",a[i]);
}

}
