#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *nextptr;
	
	};

	struct  node *startNode;
   
    static void creatNodeList(int totalnodes);
    static void displayList();
	
	int main()
	{
		int numberOfnode;
		printf("Input the number of nodes:");
		scanf("%d",&numberOfnode);
		creatNodeList(numberOfnode);
		printf("\nData entered the list:\n");
		displayList();
		return 0;
	}
	static void creatNodeList( int totalnodes)
	{
		struct node *newNode;
		struct node *nodeBuffer;
		int nodeData;
		int nodeCounter;
		startNode=(struct node *)malloc(sizeof(struct node));

		if(startNode == NULL)
		{
			printf("Memory can not be allocated");
		}
		else
		{
			printf("Input data for node 1:");
			scanf("%d",&nodeData);
			startNode->data =nodeData;
			startNode->nextptr =NULL;
			nodeBuffer=startNode;
			for (nodeCounter=2;nodeCounter<=totalnodes;nodeCounter++)
			{
				newNode=(struct node *)malloc(sizeof(struct node));

				if (newNode==NULL)
				{
					printf("Memory can not be allocated");
					break;
				}
				else
				{
					printf("Input data for node %d:",nodeCounter);
					scanf("%d",&nodeData);

					newNode->data =nodeData;
					newNode->nextptr =NULL;

					nodeBuffer->nextptr =newNode;
					nodeBuffer=nodeBuffer->nextptr;
				}
			}
		}
	}
	
  static void displayList()
  {
  	struct node *nodeBuffer;
  	nodeBuffer=startNode;
  	if(nodeBuffer == NULL)
  	{
  		printf("List is empty");
  	}
  	else
  	{
  		while(nodeBuffer !=NULL)
  		{
  			printf("Data=%d\n",nodeBuffer->data);
  			nodeBuffer=nodeBuffer->nextptr;
  		}
  	}
  }
