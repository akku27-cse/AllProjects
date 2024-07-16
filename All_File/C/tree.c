#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
struct node{
	struct node *right;//right link part ar jonno
	int data;//data part ar jonno
	struct node *left;//left link part ar jonno
};
void create(struct node **,int);
void inorder(struct node *);
void search(struct node *);
/*void preorder(struct node *);
void postorder(struct node *);*/

int main(){
	int ch,num;
	struct node *p;
	p=NULL;
	while(1){
		printf("Enter your choice:\n 1.creat:\n 2.inorder\n 3.search the given number 5.exit \n");
		scanf("%d",&ch);
		switch(ch){
		
			case 1:printf("Enter your data:\n");
			scanf("%d",&num);
			create(&p,num);
			break;
		case 2:inorder(p);
			break;
			case 3:search(p);
			break;
/*			case 3:preorder(p);
			break;
			case 4:postorder(p);
			break;
*/			case 5:exit(1);
		}
	}
	return 0;
}
void create(struct node **q,int d){
	if(*q==NULL){
		(*q)=malloc(sizeof(struct node));
		(*q)->data=d;
		(*q)->left=NULL;
		(*q)->right=NULL;
		return ;
	}
	else{
		if(d>=(*q)->data){
			create(&((*q)->right),d);
			
		}
		else{
			create(&((*q)->left),d);
		}
		return ;
	}
}
void inorder(struct node *q){//sol=first check left then root then right
	if(q!=NULL){
		inorder(q->left);
		printf("Value=%d",q->data);
		inorder(q->right);
	}
	else
	return;
}
void search(struct node *q){
	int no,flag=0;
	printf("enter the numbe search:");
	scanf("%d",&no);
	if(no==q->data){
		flag=1;
	}
	if (flag==1){
		printf("%dnot found");
	}
	else
	printf("%dfound");
}

/*void preorder(struct node *q){//sol=first check root then left then right
	if(q!=NULL){
		printf("VALUE=%d",q->data);
		preorder(q->left);
		preorder(q->right);
	}
	else
	return;
}
void postorder(struct node *q){//sol=first check left thn right then root
	if(q!=NULL){
		postorder(q->left);
		postorder(q->right);
		printf("VALUE=%d",q->data);
	}
	else
	return;
}







void search(struct node *q)  
{  
    struct node *ptr;  
    int item,i=0,flag;  
    *ptr = *q;   
    if(ptr == NULL)  
    {  
        printf("\nEmpty List\n");  
    }  
    else  
    {   
        printf("\nEnter item which you want to search?\n");   
        scanf("%d",&item);  
        while (ptr!=NULL)  
        {  
            if(ptr->data == item)  
            {  
                printf("item found at location %d ",i+1);  
                flag=0;  
            }   
            else  
            {  
                flag=1;  
            }  
            i++;  
            ptr = ptr->left;  
        }  
        if(flag==1)  
        {  
            printf("Item not found\n");  
        }  
    }     
          
}




*/
