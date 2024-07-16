//#include<stdio.h>
//#include<malloc.h>
//#include<stdlib.h>
//struct node{
//	int data;
//	struct node  *link;
//};
//void create(struct node **);
//void display(struct node *);
//int main()
//{
//	  int ch;
//	  struct node *p;
//	  while(1){
//	  
//	     
//	  printf("Enter the choice:\n 1.for creat \n 2.for insert at beg: \n 3.for insert at last:/n 4.for insert at any position:\n 5.for display:\n 6.for exit:");
//	  
//	  scanf("%d",&ch);
//switch(ch){
//	case 1:create(&p);
//	break;
//	case 2:display(p);
//	break;
//	case 3:exit(1);
//}
//
//
//
//}
//
//}
//void create(struct node **q){
//	int d1;
//	printf("Enter the data:");
//	scanf("%d",&d1);
//	struct node *temp;
//	if(*q==*q){
//		temp=malloc(sizeof(struct node));
//		temp->data=d1;
//		temp->link=*q;
//		*q=temp;
//	}
//	else{
//		struct node*r=*q;
//		while(r->link!=*q){
//			r=r->link;
//		}
//		temp=malloc(sizeof(struct node));
//		temp->data=d1;
//		temp->link=*q;
//		r->link=temp;
//		
//	}
//	}
//void display(struct node *q){
//	struct node *r;
//	*r=*q;
////	if(*r==*q){
////		printf("list is empty");
//  //	}
////	else{
//	
//while(r->link!=q){
//	printf("\n NODE=%d\n",r->data );
//	r=r->link;
//}
//}	
//
//

// circular linked list


#include<stdio.h>
#include<stdlib.h>

struct node {
	int data;
	struct node *next;
	
};

int main(){
	struct node *head;
	struct node *first;
	struct node *second;
	
	head=(struct node*)malloc(sizeof(struct node));
	first=(struct node*)malloc(sizeof(struct node));
	second=(struct node*)malloc(sizeof(struct node));
	     
	
	head->data=77;
	head->next=first;


    first->data=78;
    first->next=second;
    
    second->data=27;
    second->next=head;
     
     void insert(){
     	struct node* newnode;
     	newnode=(struct node*)malloc(sizeof(struct node));
     		newnode->data=277;
     	if(head==NULL){
     		
     		newnode->next=head;
     		head=newnode;
		 }
		 else{
		 	struct node *temp;
		 	temp=head;
		 	while(temp->next!=head){
			 
		 	temp=temp->next;
		 	
		 	newnode->next=head;
		 	head=newnode;
			temp->next=newnode;
		 }
		 	
		 }
	 }
     void tra(){
     	struct node* ptr;
     	ptr=head;
     	while(ptr->next!=head){
     		printf("%d\n",ptr->data);
     		ptr=ptr->next;
		 }
		 printf("%d\n",ptr->data);
	 }
	 insert();
	 tra();
}



















