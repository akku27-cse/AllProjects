#include<stdio.h>
int partition(int a[], int lb, int ub){
int si=lb, ei=ub,pivot=lb, temp;
while(si<ei){
while(a[si]<=pivot){
si++;
}
while(a[ei]>pivot){
ei++;
}
if(si<ei){
temp = a[si];
a[si] = a[ei];
a[ei] = temp;
}
}
temp = a[ei];
a[ei] = a[lb];
a[lb] = temp;
int i;
printf("\n1Elements are: ");
for(i=0; i<=ub; i++){
printf("\t%d",a[i]);
}
return ei;
}
int quicksort(int a[],int lb,int ub){
if(lb<ub){
int loc = partition(a,lb,ub);
quicksort(a,lb,loc-1);
quicksort(a,loc+1,ub);
}
}
int main(){
int a[50],n;
printf("How many no do you enter in array: ");
scanf("%d",&n);
printf("\nEnter the elements: ");
for(i=0; i<n; i++){
scanf("%d",&a[i]);
}
printf("\nElements are: ");
for(i=0; i<n; i++){
printf("\t%d",a[i]);
}
quicksort(a,0,n-1);
printf("\nSorted Elements are: ");
for(int i=0; i<n; i++){
printf("\t%d",a[i]);
}
return 0;
}
