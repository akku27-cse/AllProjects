#include<stdio.h>
#include<math.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};
void LinkPrint(struct node *ptr){
		while(ptr!=NULL){ //  data read one by one 
		printf("%d\n",ptr->data);// print one by one 
		ptr=ptr->next;// ptr point to next 
	}
}

int main(){
struct node *head;
struct node *second;
struct node *third;


head =(struct node *) malloc(sizeof(struct node));
	second =(struct node *) malloc(sizeof(struct node));
	third =(struct node *) malloc(sizeof(struct node));	
	
	head->data=9;
	head->next=second;
	
	second->data=5;
	second->next=third;
	
	
	third->data=1;
	third->next=NULL;
	
	LinkPrint(head);    
	
	
}
