#include<stdio.h>
#include<string.h>
struct First{
	char name[200];
	//float marks;
	int no;
	
	
};
int  main(){
	struct First first1;
	strcpy(first1.name,"Santu");
//	first1.marks=27.7;
	first1.no=27;
	printf("mayname is =%s\n",first1.name);
//	printf(first1.marks);
	printf("my roll no is =%d",first1.no);
}
