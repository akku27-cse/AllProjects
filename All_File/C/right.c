#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct node{
	int data;// for creat data part
	struct node *link;//for data next which hold to next node address

};
void create(struct node **);
void display(struct node *);
void totalNumberOfElementAndAverage(struct node **);
//void aver(struct node **);
int main(){
	int ch;//for choice the number which operstion done 
	struct node *p;//p is pointer which hold the node 
	p=NULL;//kono node creat hoy ni tai p =NULL
	while(1){ // while part ta sob somoy cholte thakbe
		printf("Enter your choice\n  \n 1.For create\n 2.For Total Number OF Element And Average of element\n 3.For display\n \n 4.For exit\n");
		scanf("%d",&ch);
		switch(ch){
			case 1:create(&p);
			break ;
			case 2:totalNumberOfElementAndAverage(&p);
			break;
	//	case 3:aver(&p);
	//		break;

				case 3:display(p);
				break;
				case 4:exit(1);
		}

	}
	return 0;
}
void create(struct node **q)
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
void totalNumberOfElementAndAverage(struct node **q){
	struct node *temp=*q;//head jta q chilo seta akhon temp k old korbe 
	int count=0;//count akta int data type jar value 0
	float sum=0,c=0,avg;
	while(temp!=NULL){//jotokhon na temp ta null hochhe totkhon loop cholbe .akane kintu temp ar link check korbe na
		temp=temp->link;//temp ar location increese hobe
		count++;// count increese hote thakbe
	}
	printf("\n Total number of element is =%d \n",count);//output print korbe
struct node *t=*q;//akane t akta pointer jat head ta k holf korbe
	while(t!=NULL){//atao check korbr jotkhon na temp value ta null hochhe
		sum=sum+t->data;//suppose data =6/ so sum=0+6
		c++;//node count korte thakbe and increese hote thakbe. count hobe 0+1=1
		t=t->link;
	}
	avg=sum/c;//avg=6/1=6
	printf("Average of the element is =%f \n",avg);
  
}   




















