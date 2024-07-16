#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct node{
	int data;// for creat data part
	struct node *link;//for data next which hold to next node address

};
void creat(struct node **);
void display(struct node *);
void insertAtbeg(struct node **);
void insertAtlast(struct node **);
void insertAtn(struct node **,int pos,int d3);
int main(){
	int ch;//for choice the number which operstion done 
	struct node *p;//p is pointer which hold the node 
	p=NULL;//kono node creat hoy ni tai p =NULL
	while(1){ // while part ta sob somoy cholte thakbe
		printf("Enter your choice\n  \n 1.For creat\n 2.for insertAtbeg\n 3.For insertAtlast\n \n4.For insertAtn\n \n5.For deleteAtbeg\n \n 6.For deleteAtn\n \n 7.For display\n \n8.For exit\n");
		scanf("%d",&ch);
		switch(ch){
			case 1:creat(&p);
			break ;
			case 2:insertAtbeg(&p);
			break;
    		case 3:insertAtlast(&p);
			break;
			case 4:insertAtn(&p,pos,d3);
			printf("enter your position\n");
			scanf("%d",&pos);
			printf("enter your data\n:");
			scanf("%d",&d3);
			
			break;
//			case 5:deleteAtbeg();
//			break ;
//			case 6:deleteAtn();
//				break;
				case 7:display(p);
				break;
				case 8:exit(1);
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
  	temp->data=d;//temp ar data dayowa holo
  	temp->link=NULL;//datar j link seta k null korte hobe   
  	*q=temp;//q jta head chilo seta abar temp j node ta hold kore chio seta k hold korlo 
  }	
  else{
  	r=*q;//r akta pointer jta heda k assign krlo akon q namer node ta hoya gelo r
  	while(r->link!=NULL){ // check korbo r ar next ab link part kauk linkkorche naki null jodi condition true hoy loop cholbe jotokhon na loop false hocchhe 
  		r=r->link;//r ar link ta ageote thakbe jotokhon na condition false hochhe

  	}
  	temp=malloc(sizeof(struct node));//condition false hole akta node banabe jata nam hobe temp
  	temp->data=d;//temp ar data part a deta entery kora hobe // r akta jins link a duto part akta data r aktalink amara use korbo
  	temp->link=NULL;// r temp ar link tak amra nll kore debo
  	r->link=temp;// r nam a  node ta takbe setr link part temp anme node ta k niya nijer nam a chalbe
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
void insertAtbeg(struct node **q){
	int d1;
	struct node *temp;
	printf("Ente the data at beg:");
	scanf("%d",&d1);
	temp=malloc(sizeof(struct node));
	temp->data=d1;
	if(*q==NULL){
		temp->link=NULL;
		*q=temp;
	}
	else{
		temp->link=*q;
		*q=temp;
	}
	
}
void insertAtlast(struct node **q){
	int d2;
	  struct node *temp;
	printf("Enter the number at the last:");
	scanf("%d",&d2);
	temp=malloc(sizeof(struct node));
	temp->data=d2;
	temp->link=NULL;
	if(*q==NULL)
	{
		*q=temp;
		
	}
	else{
		 struct node *r=*q;
		//struct node *r=*q;
		while(r->link != NULL){
			r=r->link;
			r->link=temp;
		}
	}
} 
void insertAtn(struct node **q,int d3,int pos){
	int i=0;
	
	struct node *temp;
//	printf("Enter the number of the n position:");
//	scanf("%d",&d3);
	temp=malloc(sizeof(struct node));
	temp->data=d3;
	temp->link=NULL;
	if(q==NULL)
	*q=temp;
	else{
		struct node *r=*q;
//		printf("enter your position:");
		for(i=0;i<pos-1;i++)
		{
//			scanf("%d",&pos);
			r=r->link;
			
		}
		temp->link=r->link;
		r->link=temp;
		}
	}


























