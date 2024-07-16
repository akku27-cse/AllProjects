#include<stdio.h>
#include <stdlib.h>//for use exit
int a[10],top=-1,ele,ch;
void push(){
	printf("Enter the eleemnt:\n");
	scanf("%d",&ele);
	top=top+1;//top=top+1 mean top ar value -1 chilo ba top jodi onno kono location a thakto tar porer location a jetay hole top incremment korte hobe //
	if(top>9){ //okhnae to array  size 10 diya rekkhe chi tai ata check korbo j array ta faka ache ki na
		printf("overflow");
   
	}
	
	else{
		a[top]=ele;//incremment korar por jekhane top thakbe sekhane value insert hobe 
	}
}
void pop(){
	if(top==-1){//array empty ache kina check korar jonoo .empty thale delete kak korbo
		printf("underflow");
		
	}
	else{
		printf("delete is %d",a[top]);// stack a top j value ta k hold korbe setai first dele hobe karon stack list in first out tai jta last insert hobe srta first delete hobe//
		top--;//topp-- korlam karon delete ar por top ar man kome tra left side ar location a hold korbe 
	}
}
void display(){
	int i;
	for (i=0;i<=top;i++)
	{
		printf("%d",a[i]);
	}
}
int main()
{
	//a=array ch=choice ele=element top-1=top location
	while(1){
		printf("1 for push:\n 2.for pop:\n 3.for display:\n 4.for exit");
		scanf("%d",&ch);
		switch(ch){
			case 1:push();
			break;
			case 2:pop();
			break;
			case 3:display();
			break;
			case 4:exit(1);

		}
	}

return 1;	
}

