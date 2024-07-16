#include<stdio.h>
int main(){
int a[100],j,temp,n,i;
printf("Enter How many number:\n");
scanf("%d",&n);
printf("Enter the element:\n");
for(i=0;i<n;i++){
	scanf("%d",&a[i]);
}
for(i=1;i<n-1;i++){
 temp=a[i];//1
 j=i-1;//j=0
 while(temp<a[j] && j>=0){//1<0  0>0
 	a[j+1]=a[j];
 	j--;
 }
 a[j+1]=temp;
}
for(i=0;i<n;i++)	
printf(" sorting are:%d",a[i]);
}
