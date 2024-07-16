//////c use for
////#include<stdio.h>
////int main(){
//////	int no=30,i=100;
//////	
////////	scanf("%d",&no);
////////	for (i=0;i<no;	i++);
////////	printf("entter any number:");
////////	{
////////		printf("%d",no);
//////
////////	
////////	}
//////do{
//////	printf("%d \n",i,no);
//////	i++;
//////}	while(i<no);
//////printf("%d",no);
//////	return 0;
///////print integer value in reverce order
////int no=25,i;
////do{
////	i=no%10;
////	printf("%d \n",i);
////	no=no/10;
////}while(no!=0);
////
////
////
////
////
////
////
////}
//#include<stdio.h>
////#include<string.h>
////#include<stdlib.h>
//struct student
//{
//	int id;
//	float marks;
//	char sub;
//}sam,ram,kee;
////void print(){
////	printf("%d,%f,%c",ram.id,ram.marks,ram.sub);
//
//  int main()
//  {
////	struct student sam,ram,kee;
//	ram.id=1;
//	ram.marks=58.03;
//	ram.sub="english";
//	printf("%d\n",ram.id);
//	printf("%f",ram.marks);
//	printf("%s",ram.sub);
//	return 0;
//}
#include<stdio.h>
struct a{
	int x;
	int y;
	int z;
};
int main()
{
	struct a obj;
	obj.x=50;
	obj.y=40;
	obj.z=obj.x+obj.y;
	printf("%d\n",obj.z);
	return 0;
}
