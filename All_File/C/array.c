//
/////#include<stdio.h>
//////void main(){
//////	int a[3]={5,7,8,9};
//////	int i=0;
//////	for(i=0;i<3;i++){
//////		printf("%d\n",a[i]);
//////	}
//////}
////
/////*    linear serach
////#include<stdio.h>
////void main(){
////	int a[4]={4,8,3,2};
////	int i=0,flag=0,no;
////	printf("enter the number to search:");
////	scanf("%d",&no);
////	for(i=0;i<4;i++){
////		if(a[i]==no){
////		flag=1;
////		}
////		
////	}
////	if(flag==1){
////			printf("find\n");
////			
////		}
////		else{
////			printf("not find\n");
////		}
////	
////}
////*/
////
////
////#include<stdio.h>
////int main(){
////	int a[4]={8,9,4,2,6};
////	int temp,i,j;
//////	for(i=0;i<4;i++){
//////		printf("%d",a[i]);
//////	}
////
////for(i=1;i<4;i++){   //check 0<4 
////	for(j=0;j<(4-i);j++){// check 1<(4-0)=4
////		if(a[j]> a[j+1]){
////			// swaping fomula
////			
////			temp=a[j];
////			a[j]=a[j+1];
////			a[j+1]=temp;
////		}
////	}
////		for(i=0;i<4;++i){
////			printf("%d",a[i]);
////			return 0;
////		
////	}
////}
////
////
////
////}
////
////
////
////
////
////
////
////
////
////
////
////
////
////
//// merge sort
///*
//    #include <stdio.h>  
//       
//    void merge(int a[], int beg, int mid, int end)    
//    {    
//        int i, j, k;  
//        int n1 = mid - beg + 1;    
//        int n2 = end - mid;    
//          
//        int LeftArray[n1], RightArray[n2]; //temporary arrays  
//          
//       
//        for (int i = 0; i < n1; i++)    
//        LeftArray[i] = a[beg + i];    
//        for (int j = 0; j < n2; j++)    
//        RightArray[j] = a[mid + 1 + j];    
//          
//        i = 0;  
//        j = 0;   
//        k = beg;    
//          
//        while (i < n1 && j < n2)    
//        {    
//            if(LeftArray[i] <= RightArray[j])    
//            {    
//                a[k] = LeftArray[i];    
//                i++;    
//            }    
//            else    
//            {    
//                a[k] = RightArray[j];    
//                j++;    
//            }    
//            k++;    
//        }    
//        while (i<n1)    
//        {    
//            a[k] = LeftArray[i];    
//            i++;    
//            k++;    
//        }    
//          
//        while (j<n2)    
//        {    
//            a[k] = RightArray[j];    
//            j++;    
//            k++;    
//        }    
//    }    
//      
//    void mergeSort(int a[], int beg, int end)  
//    {  
//        if (beg < end)   
//        {  
//            int mid = (beg + end) / 2;  
//            mergeSort(a, beg, mid);  
//            mergeSort(a, mid + 1, end);  
//            merge(a, beg, mid, end);  
//        }  
//    }  
//       
//    void printArray(int a[], int n)  
//    {  
//        int i;  
//        for (i = 0; i < n; i++)  
//            printf("%d ", a[i]);  
//        printf("\n");  
//    }  
//      
//    int main()  
//    {  
//        int a[] = { 12, 31, 25, 8, 32, 17, 40, 42 };  
//        int n = sizeof(a) / sizeof(a[0]);  
//        printf("Before sorting array elements are - \n");  
//        printArray(a, n);  
//        mergeSort(a, 0, n - 1);  
//        printf("After sorting array elements are - \n");  
//        printArray(a, n);  
//        return 0;  
//    }  
//*/
//
//
//
////linked list
//#include<stdio.h>
//#include<stdlib.h>
//struct node{
//	int data;
//	struct node *next;
//};
//void traversal(struct node* ptr){
//	while(ptr->next!=NULL){
//	
//	printf("%d\n",ptr->data);
//	ptr=ptr->next;
//}
//}
//void main(){
//	struct node * head;
//	struct node * second;
//	struct node * third;
//	struct node * last;
//	// memory allocate in heap beacuse dynamic memory allocation
//	head=(struct node*)malloc(sizeof(struct node));
//    second=(struct node*)malloc(sizeof(struct node));	
//	 
//	 third=(struct node*)malloc(sizeof(struct node));
//	 last=(struct node*)malloc(sizeof(struct node));
//	 //value added
//	  head->data=7;
//	  head->next=second;
//	  
//	  
//	  second->data=8;
//	  second->next=third;
//	  
//	  third->data=9;
//	  third->next=last;
//	  
//	  last->data=27;
//	  last->next=NULL;
//	   
//	traversal(head);
//}
//
// full singly link list insert at beg,end,mid and delete at beg,end,mid

#include<stdio.h>
#include<stdlib.h>
struct node {
	int data;
	struct node *next;
	
};
void traversal(struct node* ptr){
	while(ptr!=  NULL){
	
	printf("%d\n",ptr->data);
	ptr=ptr->next;
}
}




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
	 //value added
	  head->data=7;
	  head->next=second;
	  
	  
	  second->data=8;
	  second->next=third;
	  
	  third->data=9;
	  third->next=last;
	  
	  last->data=27;
	  last->next=NULL;
	  void insert(){
	struct node *new1;
	new1=(struct node*)malloc(sizeof(struct node));
	if(head==NULL){
		new1->data=7;
		new1->next=NULL;
	}
	else
	{
	
	new1->data=7;;
	new1->next=head;
}
//printf("inserted sucessfully");
}
void endnode(){
		struct node *newend;
	newend=(struct node*)malloc(sizeof(struct node));
	if(head==NULL){
		newend->data=8;
		newend->next=NULL;
	}
	else
	{
	last->next=newend;
	newend->data=8;
	newend->next=NULL;
}
//printf("inserted sucessfully");
}
void deletebeg(){
	if(head==NULL){
		printf("linked list is empty");
		
	}
	struct node *temp=head;
	if(head->next==NULL){
		head=NULL;
		free(temp);
	}
	else{
		head=temp->next;
		free(temp);
	}
	
}

	insert();
	endnode();   
	deletebeg();
	traversal(head);
	

return 0;

}
