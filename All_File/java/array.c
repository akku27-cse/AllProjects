#include<stdio.h>
#include<conio.h>
#include<alloc.h>
#include<stdlib.h>
#define max 5
int cqueue[max];
int front=-1;
int rear=-1;
void main()
{
	clrscr();
	void insert(),del(),display();
	int choice;
	while(1)
	{
		printf("1.insert\n");
		printf("2.delete\n");
		printf("3.display\n");
		printf("4.quit\n");
		printf("enter your choice:");
		scanf("%d",&choice);
		{
			case 1:insert();
			break;
			case 2:del();
			break;
			case 3:display();
			break;
			case 2:exit(1);
			break;
			default:
				printf("wrong choice\n");
				
			
		}
	}
}
   void insert()
   {
   	int item;
   	if((front==0&&rear=max-1)||(front==rear+1))
   	return;
   	{
   		printf("queue is overfloww\n");
   		return;
   }
	   if(front==-1)/* If queue is empty*/
	  {
	  	front=0;
	  	rear=0;
		} 
		else  
		if(rear==max-1)/*raer is last posotion of queue*/
		rear=0;
		else
		rear=rear+1;
		printf("input the element for insertion:");
		scanf("%d",&item);
		cqueue[rear]=item;
       }
       void del()
       {
       	if (front==-1)
       	{
       		printf("Queue underflow\n");
       		return;
		   }
		   printf("deleted element from queue is :%d\n",cqueue[front]);
		   if(front==rear)/* queue has only one element*/
		   {
		   	front=-1;
		   	rear=-1;
		   }
		   else 
		   if(front==max-1)
		   front=0;
		   else
		   front=front+1;
		 }
		 void display()
		 {
		 int front_pos=front,raer_pos=raer;
		 if(front==-1)
		 {
		 	printf("queue is empty\n");
		return;
		}
		printf("queue element arre:\n");
		if(front_pos<=rear_pos)
		while(front_pos<=raer_pos)
		{
			printf("%d\n",cqueue[front_pos]);
			front_pos++;
			}
			else 
			{ 
			while(front_pos<=max-1)
			{
				printf("%d\n",cqueue[front_pos]);
				front_pos++;
			}
			front_pos=0;
			while(front_pos<=rear_pos)
			{
				printf("%d\n",cqueue[front_pos]);
				front_pos++;
			}
			}
			printf("\n");
			}
