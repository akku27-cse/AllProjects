//#include<stdio.h>
//int main(){
//	int i=2;
//	printf("%d,%dn",++i,++i);
//	return 0;
//}
//
////answer =4,4

//2
//#include<stdio.h>
//void main(){                  //=====>>>>>>answer =compiler error
//	int const SIZE=5;
//	int expr;
//	double value[SIZE]={2.0,4.0,6.0,8.0,10.0};
//	expr=1|2|3|4;
//	printf("%f",value[expr]);
//}

//=================question3===========ans=>>>>>>12448
//#include<stdio.h>
//int main(){
//	char c=48;
//	int i,mask=01;
//	for(i=1;i<5;i++){
//		printf("%c",c|mask);
//		mask=mask<<1;
//	}
//	return 0;
//}


//======================question 4=====ans==>>incomplete

//#include<stdio.h>
//int main(){
//	FILE *fp;
//	char ch;
//	int i=1;
//	fp=fopen("myfile.c")
//}


//============question 5=======ans==>>no output

//#include<stdio.h>
//int main(){
//	short i;
//	for(i=0;i>0;i++){
//		printf("%dn",i);
//	}
//}

//==============================question6 =============ans===>>>52,2,2
//#include<stdio.h>
//int main(){
//	int a[3][4]={1,2,3,4,5,6,7,8,9,10,11};
//	printf("%u,%u,%un",a[0]+1,*(a[0]+1),*(*(a+0)+1));
//	return 0;
//}

//===========================question7===========>>>>>>ans===>>>Error:in NODEPTR
//#include<stdio.h>
//typedef struct{
//	int data;
//	NODEPTR link;
//}*NODEPTR;
//int main(){
//	
//}



//===============question 8==========>>>>>>MESS
//#include<stdio.h>
//#define MESS junk
//int main(){
//	printf("MESSn");
//	return 0;
//}



//====================question 9===========>>>>>>>ans==>>>>0
//#include<stdio.h>
//#include<string.h>
//int main(){
//  static char s[]="hello!";
//  printf("%dn",*(s+strlen(s)));
//  return 1;
//}



//question 10==========>>>>>ans====>>>>>>0,1,2,3,4
//#include<stdio.h>
//int main(){
//	int arr[5],i=-1,z;
//	while(i<5)
//	arr[i]=++i;
//	for(i=0;i<5;i++)
//	printf("%d , ",arr[i]);
//	return 0;
//	}

//question 8===============>>>ans=======>>>>>1 2 3 4
//#include<stdio.h>
//void fun(int);
//
//int main(int argc){
//	printf("%d",argc);
//	fun(argc);
//	return 0;
//}
//void fun(int i){
//	if(i!=4)
//	main(++i);
//}
	
// ================question 11==========ans=======>>>>>>0 2
//#include<stdio.h>
//void f(int *p,int *q){
//	p=q;
//	*p=2;
//	
//}
//int I=0,j=1;
//int main(){
//
//f(&I,&j);
//printf("%d%d/n",I,j);
//return 0;
//}
  
