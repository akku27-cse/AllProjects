#include <stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;

};
void printlink(struct node *head){
	struct node *ptr =head;// point to head 
	/*	printf(" %d",ptr->data);
		ptr=ptr->next;
	while(ptr!=head){
		printf("%d",ptr->data);
		ptr=ptr->next;
	}*/
	//another process
	do{
			printf("%d",ptr->data);
		ptr=ptr->next;
	}while(ptr!=head);

}
int main(){
	struct node * head;
	struct node * second;
	struct node * third;
	head =(struct node *) malloc(sizeof(struct node));
	second =(struct node *) malloc(sizeof(struct node));
	third =(struct node *) malloc(sizeof(struct node));
	// linking and put data by  node 

	head->data=7;
	head->next=second;
	// second node are linking
	second->data=9;
	second->next=third;
	// third node data put and linkung
	third->data=5;
	third->next=head;
	//return 0;
	printlink(head);
return 0;
}
