#include<stdio.h>
#include <stdlib.h>
 struct Node{
 	int data;
 	struct Node* next;
 };
 struct Node* head;
 void Insert(int data);
 void print();
 void Delete(int n);
 int main()
 {
  head = NULL;
  Insert(2);
  Insert(4);
  Insert(6);
  Insert(8);
  Insert(5);
  int n;
  printf("Enter a position\n");
  scanf("%d",&n);
  Delete(n);
  print();
 }
 void Delete(int n)
 {
 	struct Node* temp1=head;
 	if(n==1)
 	{
 		head=temp1->next;
 		free(temp1);
 		return;
 	}
 	int i;
 	for(i=0;i<n-2;i++)
 	{
 		temp1=temp1->next;
 		struct Node* temp2=temp2->next;
 		temp1->next=temp2->next;
 		free(temp2);
 	}
 }
