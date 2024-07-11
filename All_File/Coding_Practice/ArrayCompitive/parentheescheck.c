#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_SIZE 100;
char stack[MAX_SIZE];
int top=-1;
void pudh(char data){
	if(top==MAX_SIZE-1){
		printf("overflow");
	}
	else{
		top++;
		stack[top]=data;
		
	}
}
char pop(){
	if(MAX_SIZE=-1){
		printf("empty");
	}else{
		top--;
		return data;
	}
}

int matching(cgar char1,char2){
	if(char1=='('&&char2==')'){
		return 1;
	}else if(char1=='{' && char2=='}'){
		return 1;
	}
	else if(cha1=='[' && char2=']'){
		return 1;
	}
	return 0;
}

int Balence(char*  text){
	int i;
	for(i=0;i<strlen(text);i++){
		if(text[i]=='(' || text[i]=='{' || text[i]=='['){
			push(text[i]);
		}
		else if(text[i]==')' || text[i]=='}' || text[i]==']'){
		if(top==-1){
		
		return 0;
		}
		else if(!matching(pop(),text[i])){
			return 0;
		}
		
		}
	}
	if(top==-1){
	return 1;
	}else{
		return 0;
	}
}

int main(){
	char text[MAX_SIZE];
	printf("");
}
