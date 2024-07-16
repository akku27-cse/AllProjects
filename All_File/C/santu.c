#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct node{
	int data;// for creat data part
	struct node *link;//for data next which hold to next node address

};
void creat(struct node **);
void display(struct node *);
/*void count(struct node **);
void aver(struct node **);
void findMmiddle(struct node **);
void maximum(struct node **);*/
int main(){
	int ch;//for choice the number which operstion done 
	struct node *p;//p is pointer which hold the node 
	p=NULL;//kono node creat hoy ni tai p =NULL
	while(1){ // while part ta sob somoy cholte thakbe
		printf("Enter your choice\n  \n 1.For creat\n 2.For count the number:\n 3.For average of element:\n 4.For display\n \n 5.for find the middle:\n 6.For exit");
		scanf("%d",&ch);
		switch(ch){
			case 1:creat(&p);
			break ;
		//	case 2:count(&p);
		//	break;
		//case 3:aver(&p);
		//	break;

				case 4:display(p);
				break;
			/*	case 5:findMmiddle(&p);
				break;
				case 6:maximum(&p);
				break;*/
				case 7:exit(1);
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
	//struct node *r;
	//r=*q;
	/*r=q;
while(*q=r){
	printf("\n NODE=%d\n",r->data );
	r=r->link;
	*/
	//printf(*q->data);
	if(q==NULL){
		printf("list is empty");
	}
	else
  printf("first element is=%d\n",q->data);
}
