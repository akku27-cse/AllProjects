#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct node{
	int data;// for creat data part
	struct node *link;//for data next which hold to next node address

};
void creat(struct node **);
void display(struct node *);
//void count(struct node **);
void sle(struct node **);
//void findMmiddle(struct node **);
//void maximum(struct node **);
int main(){
	int ch;//for choice the number which operstion done 
	struct node *p;//p is pointer which hold the node 
	p=NULL;//kono node creat hoy ni tai p =NULL
	while(1){ // while part ta sob somoy cholte thakbe
		printf("Enter your choice\n   \n 1.For creat:\n 2.For display\n 3.find secod last number\n 4.for exit");
		scanf("%d",&ch);
		switch(ch){
			case 1:creat(&p);
			break ;

				case 2:display(p);
				break;
				case 3:sle(&p);
				break;
				case 4:exit(1);
		}

	}
	return 0;
}
void creat(struct node **q)
{
  int d;
  struct node *temp,*r;
  printf("Enter the data \n" );
  scanf("%d",&d);
  if(*q==NULL){ //first node head jtak q point kore rakche//jodi q ta null hoy taholay 
  	temp=malloc(sizeof(struct node));// akta node creat holo jtar size temp pointer a holo ba j  node take temp point korche
  	temp->data=d;
  	temp->link=NULL;  
  	*q=temp;//q jta head chilo seta abar temp j node ta hold kore chio seta k hold korlo 
  }	
  else{
  	r=*q;
  	while(r->link!=NULL){  
  		r=r->link;

  	}
  	temp=malloc(sizeof(struct node));
  	temp->data=d;
  	temp->link=NULL;
  	r->link=temp;
  }
}
void display(struct node *q){
	struct node *r;
	r=q;
while(r!=NULL){
	printf("\n NODE=%d\n",r->data );
	r=r->link;
}
}
 void sle(struct node **q){
 	struct node *temp=*q,*r=NULL;
 	if(temp==NULL){
 		printf("Empty list\n");
	 }
	 else if((temp->link==NULL)){
	 	printf("only one element\n ");
	 }
	 else{
	 
 	while(temp->link!=NULL){
 		r=temp;
 		temp=r->link;
	 }
	 printf("The second last element is=%d\n",r->data);
 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
