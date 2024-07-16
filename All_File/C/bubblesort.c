#include<stdio.h>
int main(){
int a[100],j,temp,n,i;
printf("Enter How many number:\n");
scanf("%d",&n);//4
printf("Enter the element:\n");
for(i=0;i<n;i++){
	scanf("%d",&a[i]);
}
for(i=0;i<n-1;i++){//number of passes
	for(j=0;j<n-1-i;j++){/// number of comperssion
		if(a[j]>a[j+1]){//jodi condition true hoy tahole baki ta hobe nahole abar for loop a  jabe
			temp=a[j];//temp ta a[j] ar man k hold korbe
			a[j]=a[j+1];//a[j]ta a tar pore ar  man ta hobe 
			a[j+1]=temp; //r temp ta seta kai hold korbe
		}
	}
}
for(i=0;i<n;i++)	
printf(" sorting are:%d",a[i]);
}
//#include<stdio.h>
//#include<stdlib.h>
//void parray(int* a,int n){
//	int i1;
//	for(i1=0;i1<n;i1++){
//		printf("%d",&a[i1]);
//	}
//	for(i=0;i<n;++i)
//	printf("%d",a[i]);
//}
//
//
//
//int main(){
//	int a[100],i,n;
//	printf("Enter t How many number:\n");
//	scanf("%d",&n);
//	printf("Enter the element:\n");
//	for(i=0;i<n;i++){
//		scanf("%d",&a[i]);
//	}
//	
//}


