#include<stdio.h>
int main(){
	char ch;
	while(1){
	
	printf("enter any alphab number:");

/*	for(ch='A';ch<='Z';ch++)
	{
		printf("%c=%d\n",ch,ch);
	}
//	char ch='A';*
	while(ch<='Z'){
		printf("%c=%d\n",ch,ch);
		ch++;
	}*/
do{
	scanf("%c",&ch);
	printf("%c=%d\n",ch,ch);
	ch++;
}while(ch<='Z');
}
return 0;

}  
