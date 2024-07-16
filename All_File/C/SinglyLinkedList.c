#include<stdio.h>
#include<stdlib.h>
#include<math.h>
struct node{
	int data;
	struct node *next;
};

void insertAtBeg(int value){
struct node *newnode;
struct node *head;
newnode=(struct node *)malloc(sizeof(struct node));
newnode->data=value;
if(head==NULL){
	newnode->next=NULL;
	head=newnode;
}
else{
	newnode->next=head;
	head=newnode;
}
}
void insertAtEnd(int value){
	
}

void insertAtSpecific(int value,int pos){
	
}
void Display(){// function creating
struct node *head; 
    struct node *ptr=head;
	while(ptr!=NULL){ //  data read one by one 
		printf("%d\n",ptr->data);// print one by one 
		ptr=ptr->next;// ptr point to next 
	}
}

int main(){
	
	int choice,value,pos;
	while(1){
	
	printf("enter your Choice:\n \n1.Insert At beg...\n2.Insert at End\n3.Insert at specific:\n4.Display:\n5.Exit");
	scanf("%d",&choice);
switch(choice){
	case 1:printf("enter the Value to be Insert At beg:\n");
	scanf("%d",&value);
	insertAtBeg(value);
	break;
	case 2:printf("enter the value to be Insert at End:\n");
	scanf("%d",&value);
	insertAtEnd(value);
	break;
	case 3:printf("Enter the value to be Inserted at Specific position:\n");
	scanf("%d",&value);
	printf("Enter the position where elemnt are Inserted:");
	scanf("%d",&pos);
	insertAtSpecific(value,pos);
	break;
	case 4:Display();
	break;
	case 5:exit(0);
	default:printf("worng choice...please enter right choice");
	
}	
}
}
