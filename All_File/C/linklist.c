 #include<stdio.h>
//#include<Strig.h>
//#include<conio.h>
#include<math.h>
#include<stdlib.h>
struct node{
	int data;
	struct node * next;// node ar nex ta k point korbe 

};
void linklistprint(struct node *ptr){// function creating 
	while(ptr!=NULL){ //  data read one by one 
		printf("%d\n",ptr->data);// print one by one 
		ptr=ptr->next;// ptr point to next 
	}
}
int main(){
	// node cretate
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
	third->next=NULL;
	linklistprint(head);
	
	
	return 0;
}
