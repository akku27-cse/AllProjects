#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
	struct node *prv;
	
};


int main(){
	struct node * head;
	struct node * second;
	struct node * third;
	struct node * last;
	// memory allocate in heap beacuse dynamic memory allocation
	head=(struct node*)malloc(sizeof(struct node));
    second=(struct node*)malloc(sizeof(struct node));	
	 
	 third=(struct node*)malloc(sizeof(struct node));
	 last=(struct node*)malloc(sizeof(struct node));
	 
	 head->prv=NULL;
	 head->data=87;
	 head->next=second;
	 
	 second->prv=head;
	 second->data=78;
	 second->next=third;
	 
	 
	 third->prv=second;
	 third->data=8;
	 third->next=last;
	 
	 
	 last->prv=third;
	 last->data=98;
	 last->next=NULL;
	 
void insertbeg(){
	struct node* beg;
	//struct node * temp;
	
	beg=(struct node*)malloc(sizeof(struct node));
	if(head==NULL){
		beg->data=77;
		beg->prv=NULL;
		beg->next=NULL;
		
	}
	else{
		beg->data=77;
		beg->prv=NULL;
		beg->next=head;
		head->prv=beg;
		head=beg;
	}
}
void insertend(){
	struct node *end;
	end=(struct node*)malloc(sizeof(struct node));
	if(head==NULL){
		end->data=79;
		end->prv=NULL;
		end->next=NULL;
		
	}
	else{
		struct node * temp=head;
		while(temp->next!=NULL){
			
		temp=temp->next;
		end->data=79;
		end->prv=temp;
		temp->next=end;
		end->next=NULL;
		//end=temp;
	}
	}
}
	 void traverse(){
	struct node * ptr;
	
	ptr=head;
	while(ptr!= NULL){
	
	printf("%d\n",ptr->data);
	ptr=ptr->next;
}
}
	insertbeg();
	insertend();
	 traverse();
	 
}




